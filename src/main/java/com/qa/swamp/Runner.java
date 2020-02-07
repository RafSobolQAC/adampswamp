package com.qa.swamp;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map map = new Map();
		System.out.println("Hello there!");
		System.out.println("How wide would you like the map to be? ");
		map.setX(scanner.nextInt());
		System.out.println("Wonderful!");
		System.out.println("How far north should it stretch? ");
		map.setY(scanner.nextInt());
		
		System.out.println("Your map is ready.");
		
		System.out.println("Your final map size:" );
		System.out.println(map.getX() + " by " + map.getY() + " meters!");
		
		System.out.println("Now it's time to get started! ");
		
		Treasure treasure = new Treasure(map);
		Player player = new Player(map);
		
		Compass compass = new Compass(player,treasure);

	}

}
