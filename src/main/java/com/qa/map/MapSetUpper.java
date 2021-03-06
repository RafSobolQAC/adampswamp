package com.qa.map;

import com.qa.swamp.Player;
import com.qa.utils.Utils;
import com.qa.utils.YNSimplifier;


public class MapSetUpper {
	private Map map = new Map();
	private Treasure treasure;
	private Player player;
	/**
	 * Creates a MapSetUpper instance.
	 */
	public MapSetUpper() {
		setUpMap();
	}
	
	
	/**
	 * This will set up a map on which the game can be played.
	 * Takes in user input from the console.
	 * 
	 */
	public void setUpMap() {
		System.out.println("Hello there!");
		System.out.println("How wide would you like the map to be? ");
		while (map.getX() == 0) {
			try {
				map.setX(Integer.valueOf(Utils.getInput()));
			} catch (NumberFormatException e) {
				System.out.println("Please input a number!");
			}
		}
		System.out.println("Wonderful!");
		System.out.println("How far north should it stretch? ");
		while (map.getY() == 0) {
			try {
				map.setY(Integer.valueOf(Utils.getInput()));
			} catch (NumberFormatException e) {
				System.out.println("Please input a number!");
			}
		}
			
		
		System.out.println("Your map is ready.");
		
		System.out.println("Your final map size:" );
		System.out.println(map.getX() + " by " + map.getY() + " meters!");
		
		System.out.println("One last thing: do you want the map to have bounds (i.e. stop you from moving past the map boundaries you specified earlier?)");
		char yn = ' ';
		while (yn == ' ') {
			System.out.println("(Y)es (N)o");
			String input = Utils.getInput();

			yn = YNSimplifier.getPermission((input));
		}
		
		System.out.println("Now it's time to get started! ");
		
		this.treasure = new Treasure(this.map);
		this.player = new Player(this.map);
		if (yn == 'y') player.setHasBounds(true);
		else player.setHasBounds(false);
		
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

