package com.qa.enemies;

public class Chris extends Monster{
	private int posX;
	private int posY;
	private boolean alive = true;
	private int hp = 100;
	private int[] position = new int[2];
	/**
	 * The greatest monster of all.
	 * Currently unimplemented - too scary to put in the game.
	 * @param posX
	 * @param posY
	 * @param hp health points
	 */
	public Chris(int posX, int posY, int hp) {
		super(posX, posY, hp);
	}
	
	
	
}
