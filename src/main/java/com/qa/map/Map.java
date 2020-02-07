package com.qa.map;

public class Map {
	private int x;
	private int y;
	/**
	 * Sets up a new Map instance.
	 * @param x width
	 * @param y height
	 */
	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Map() {}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
