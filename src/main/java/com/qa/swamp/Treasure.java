package com.qa.swamp;

public class Treasure implements Interesting {
	private int posX;
	private int posY;
	private Map map;
	
	public Treasure(Map map) {
		
		posX = (int) ((int) map.getX()*Math.random());
		posY = (int) ((int) map.getY()*Math.random());
		
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
