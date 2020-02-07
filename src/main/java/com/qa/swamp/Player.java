package com.qa.swamp;

import com.qa.map.Map;
import com.qa.movement.Moveable;

public class Player implements Moveable {

	private int posX = 0;
	private int posY = 0;
	private boolean alive = true;
	private Map map;
	private boolean hasBounds = true;
	/**
	 * That's you!
	 * @param map Checks bounds and places player in the middle.
	 */
	public Player(Map map) {
		this.map = map;
		posX = (int) (map.getX()/2);
		posY = (int) (map.getY()/2);
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
	public void setHasBounds(boolean hasBounds) {
		this.hasBounds = hasBounds;
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
			System.out.println("Oh whoops this should not be happening");
				
		}
		if (hasBounds) checkBounds();
		
	}
	
	public void checkBounds() {
		if (posX<0) {
			posX = 0;
			System.out.println("Some magical force prevents you from moving west.");
		}
		if (posY < 0) {
			posY = 0;
			System.out.println("Some magical force prevents you from moving south.");
		}
		if (posX > map.getX()) {
			posX = map.getX();
			System.out.println("Some magical force prevents you from moving east.");
		}
		if (posY > map.getY()) {
			posY = map.getY();
			System.out.println("Some magical force prevents you from moving north.");
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
	public boolean isAlive() {
		return this.alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
