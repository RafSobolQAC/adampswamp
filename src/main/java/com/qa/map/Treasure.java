package com.qa.map;

import com.qa.utils.Utils;

public class Treasure implements Interesting {
	private int posX;
	private int posY;
	
	public Treasure(Map map) {
		
		posX = Utils.getRandom(map.getX());
		posY = Utils.getRandom(map.getY());
		
		System.out.println("Hello, I am the treasure! I am located on "+posX+" by "+posY+".");
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
}
