package com.qa.swamp;

import com.qa.utils.Utils;

public class MapSetUpper {
	private Map map = new Map();
	private Treasure treasure;
	private Player player;
	
	
	public MapSetUpper() {
		System.out.println("Hello there!");
		System.out.println("How wide would you like the map to be? ");
		map.setX(Integer.valueOf(Utils.getInput()));
		System.out.println("Wonderful!");
		System.out.println("How far north should it stretch? ");
		map.setY(Integer.valueOf(Utils.getInput()));
		
		System.out.println("Your map is ready.");
		
		System.out.println("Your final map size:" );
		System.out.println(map.getX() + " by " + map.getY() + " meters!");
		
		System.out.println("Now it's time to get started! ");
		
		this.treasure = new Treasure(this.map);
		this.player = new Player(this.map);
		Utils.delayer();


	}
	
	
	public Map getMap() {
		return this.map;
	}
	public Treasure getTreasure() {
		return this.treasure;
	}
	public Player getPlayer() {
		return this.player;
	}
}
