package com.qa.enemies;

public class Chris extends Monster{
	private int posX;
	private int posY;
	private boolean alive = true;
	private int hp = 10;
	private int[] position = new int[2];

	public Chris(int posX, int posY, int hp) {
		super(posX, posY, hp);
	}
	
	
	
}
