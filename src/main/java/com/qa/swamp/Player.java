package com.qa.swamp;

import com.qa.movement.Moveable;

public class Player implements Moveable {

	private int posX = 0;
	private int posY = 0;
	private boolean isAlive = true;

	public Player(Map map) {
		posX = (int) (map.getX()/2);
		posY = (int) (map.getY()/2);
		System.out.println("Hello! I'm the player!");
		System.out.println("I was spawned on X "+posX+" by Y "+posY+"!");
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}


	public void move(char dir) {
		switch(dir) {
		case 'e':
			this.posX++;
			break;
		case 's':
			this.posY--;
			break;
		case 'w':
			this.posX--;
			break;
		case 'n':
			this.posY++;
			break;
		default:
			System.out.println("Oh whoops this should not be happening tbqh fam");
				
		}
	}
	
	public void moveW() {
		this.posX--;
	}

	public void moveE() {
		this.posX++;

	}

	public void moveN() {
		this.posY++;

	}

	public void moveS() {
		this.posY--;

	}

}
