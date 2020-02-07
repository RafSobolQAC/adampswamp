package com.qa.swamp;

public class Compass {
	
	private double distance;
	/**
	 * Creates a compass instance, which gives the player's distance from the treasure.
	 * @param player the player with his location
	 * @param treasure the treasure with its location
	 */
	public Compass(Player player, Treasure treasure) {
		this.distance = Math.pow(Math.pow(treasure.getPosX()-player.getPosX(),2) + Math.pow(treasure.getPosY() - player.getPosY(), 2),0.5);
		System.out.println("The compass reads "+this.distance+" meters");
	}
	public boolean isOnTreasure() {
		if (distance == 0.0) {
			return true;
		} else return false;
	}
}
