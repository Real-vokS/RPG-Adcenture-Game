package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Sword;

public class AssetSetter {
		
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Key(gp);
		gp.obj[0].worldX = 23 * gp.tileSize;
		gp.obj[0].worldY = 7 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key(gp);
		gp.obj[1].worldX = 23 * gp.tileSize;
		gp.obj[1].worldY = 40 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Key(gp);
		gp.obj[2].worldX = 37 * gp.tileSize;
		gp.obj[2].worldY = 9 * gp.tileSize;
		

		gp.obj[3] = new OBJ_Door(gp);
		gp.obj[3].worldX = 10 * gp.tileSize;
		gp.obj[3].worldY = 12 * gp.tileSize;
		gp.obj[3].collision = true;
		
		gp.obj[4] = new OBJ_Door(gp);
		gp.obj[4].worldX = 48 * gp.tileSize;
		gp.obj[4].worldY = 9 * gp.tileSize;
		gp.obj[4].collision = true;
		
		
		gp.obj[5] = new OBJ_Chest(gp);
		gp.obj[5].worldX = 10 * gp.tileSize;
		gp.obj[5].worldY = 10 * gp.tileSize;
		gp.obj[5].collision = true;
		
		gp.obj[6] = new OBJ_Sword(gp);
		gp.obj[6].worldX = 15 * gp.tileSize;
		gp.obj[6].worldY = 21 * gp.tileSize;
	}
	
}
