package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.UtilityTool;

public class NPC_OldMan extends Entity{
	
	public NPC_OldMan(GamePanel gp) {
		super(gp);
		
		direction = "down";
		speed = 1;
		
		getImage();
		setDialogue();
		
		// HitBox X, Y, Width, Height
		solidArea = new Rectangle();
		solidArea.x = 12;
		solidArea.y = 20;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 24;
		solidArea.height = 24;
	}
	
	public void getImage() {
		
		up1 = setup("/npc/oldman_up_1");
		up2 = setup("/npc/oldman_up_2");
		upidle = setup("/npc/oldman_up_idle");
		down1 = setup("/npc/oldman_down_1");
		down2 = setup("/npc/oldman_down_2");
		downidle = setup("/npc/oldman_down_idle");
		left1 = setup("/npc/oldman_left_1");
		left2 = setup("/npc/oldman_left_2");
		leftidle = setup("/npc/oldman_left_idle");
		right1 = setup("/npc/oldman_right_1");
		right2 = setup("/npc/oldman_right_2");
		rightidle = setup("/npc/oldman_right_idle");
		
	}
	
	public void setDialogue() {
		dialogues[0] = "I lost my loved ones to this island.";
		dialogues[1] = "So you have choosen to come here on this \nisland.";
		dialogues[2] = "Are you looking for an adventure?";
		dialogues[3] = "Good luck to you.";
	}
	
	public void setAction() {
		
		actionLockCounter++;
		
		if(actionLockCounter == 120) {
			
			Random rnd = new Random();
			
			int i = rnd.nextInt(100)+1; // picks a number between 1 and 100
			
			
			// simple stupid AI
			if(i <= 25) {
				direction = "up";
			}
			if(i > 25 && i <= 50) {
				direction = "down";
			}
			if(i > 50 && i <= 75) {
				direction = "left";
			}
			if(i > 75 && i <= 100) {
				direction = "right";
			}
			

			actionLockCounter = 0;
			
		}
	}
	
	public void speak() {
		
		// For future unique char stuff
		
		super.speak();
	}
}
