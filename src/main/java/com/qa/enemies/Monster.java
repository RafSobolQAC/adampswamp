package com.qa.enemies;

public class Monster {

	private int posX;
	private int posY;
	private boolean alive = true;
	private int hp = 10;
	private int[] position = new int[2];
	/**
	 * Unused at the moment.
	 * @param posX X-position of the monster
	 * @param posY Y-position of the monster
	 * @param hp Monster's health points
	 */
	public Monster(int posX, int posY, int hp) {
		this.posX = posX;
		this.posY = posY;
		this.hp = hp;
//		position[0]=posX;
//		position[1]=posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
		this.position[0]=posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
		this.position[1]=posY;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
	
}
