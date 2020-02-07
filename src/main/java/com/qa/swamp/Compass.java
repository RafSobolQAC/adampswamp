package com.qa.swamp;

public class Compass {
	
	private double distance;
	private Player player;
	private Treasure treasure;
	
	public Compass(Player player, Treasure treasure) {
		this.player = player;
		this.treasure = treasure;
		this.distance = Math.pow(Math.pow(treasure.getPosX()-player.getPosX(),2) + Math.pow(treasure.getPosY() - player.getPosY(), 2),0.5);
		System.out.println("The compass reads "+this.distance+" meters");
	}
	
}
