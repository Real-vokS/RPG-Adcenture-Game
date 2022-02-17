package entity;

import java.awt.*;
import java.io.IOException;
import java.awt.image.*;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import main.UtilityTool;

public class Player extends Entity{
	
	
	KeyHandler keyH;
	
	public final int screenX;
	public final int screenY;
	
	// public int hasKey = 0;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		
		super(gp);
		
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		
		// HitBox X, Y, Width, Height
		solidArea = new Rectangle();
		solidArea.x = 12;
		solidArea.y = 20;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 24;
		solidArea.height = 24;
		
		
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() {
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 4;
		direction = "down";
	}
	
	public void getPlayerImage() {
		
		up1 = setup("/player/playerup1");
		up2 = setup("/player/playerup2");
		upidle = setup("/player/playerupidle");
		down1 = setup("/player/playerdown1");
		down2 = setup("/player/playerdown2");
		downidle = setup("/player/playerdownidle");
		left1 = setup("/player/playerleft1");
		left2 = setup("/player/playerleft2");
		leftidle = setup("/player/playerleftidle");
		right1 = setup("/player/playerright1");
		right2 = setup("/player/playerright2");
		rightidle = setup("/player/playerrightidle");
		
	}
	
	public void update() {
		
		if(keyH.upPressed == true || keyH.downPressed == true || 
				keyH.leftPressed == true || keyH.rightPressed == true) {
		
			if(keyH.upPressed == true) {
				direction = "up";
			}
			if(keyH.downPressed == true){
				direction = "down";
			}
			if(keyH.leftPressed == true) {
				direction = "left";
			}
			 if(keyH.rightPressed == true) {
				direction = "right";
			}
			 
			 // CHECK TILE COLLISION
			 collisionOn = false;
			 gp.cChecker.checkTile(this);
			 
			 // CHECK OBJECT COLLISION
			 int objIndex = gp.cChecker.checkObject(this, true);
			 pickUpObject(objIndex);
			 
			 
			 // IF COLLISION IS FALSE, PLAYER CAN MOVE
			 if(collisionOn == false) {
				 
				 switch(direction) {
				 
				 case "up":
					worldY -= speed;
					 break;
					 
				 case "down":
					worldY += speed;
					 break;
					  
				 case "left":
					worldX -= speed;
					 break;
					 
				 case "right":
					worldX += speed;
					 break;
				 }
			 }
		
			spriteCounter++;
			if(spriteCounter > 10) {
				if(spriteNum == 1) {
				spriteNum = 2;
				}
				else if(spriteNum == 2) {
					spriteNum = 3;
				}
				else if(spriteNum == 3) {
					spriteNum = 4;
				}
				else if(spriteNum == 4) {
					spriteNum = 1;
				}
				spriteCounter = 0;
			}
		}
	}
	
	public void pickUpObject(int i) {
		if(i != 999) {
			}
	}
	
	

}
