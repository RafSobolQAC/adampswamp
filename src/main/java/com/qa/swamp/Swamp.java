package com.qa.swamp;

import com.qa.utils.DirectionSimplifier;
import com.qa.utils.Utils;

public class Swamp {
	private boolean isFinished = false;
	private Player player;
	private Treasure treasure;
	private Map map;
	private char direction;
	private Compass compass;
	
	
	public Swamp(Player player, Treasure treasure, Map map) {
		this.player = player;
		this.treasure = treasure;
		this.map = map;
		
		
		
	}
	
	public Swamp(MapSetUpper mapSetup) {
		this.player = mapSetup.getPlayer();
		this.treasure = mapSetup.getTreasure();
		this.map = mapSetup.getMap();
	}
	
	public void begin() {
		System.out.println("You find yourself in the middle of a swamp.");
		System.out.println("You look around, wondering if you're dreaming. Just moments ago you were sat in a warm ");
		System.out.println("Salford office, counting down the days to your next payday in your head; now, you are ");
		System.out.println("standing knees-deep in mud. You don't even have the time to worry about how you will ");
		System.out.println("have to splash out on some new shoes, or whether your fancy new trousers will survive ");
		System.out.println("this lovely little mudbath; indeed, you are rather busy being extremely confused at what");
		System.out.println("in the hell is going on. ");
		
		System.out.println("\n\n");

		Utils.delayer();
		System.out.println("You pull your phone out of the left-front pocket of your jeans. You look down at it, and ");
		System.out.println("you unlock the-");
		System.out.println("Hold on, this isn't your phone.");
		System.out.println("\n\n\n\n\n");
		Utils.delayer();
		
		System.out.println("\'Hello!\'");
		System.out.println("The little creature in your pocket exclaims, seemingly unbothered by the fact it just got");
		System.out.println("pulled out of a stranger's pocket.");
		System.out.println("It appears to be something akin to a squirrel, if a squirrel were put through a hydraulic");
		System.out.println("press. It's approximately rectangular when you look at it from the front");
		System.out.println("\'I am your ");
		compass = new Compass(player,treasure);
		keepGoing();

	}
	public void keepGoing() {
		while (!isFinished) {
			setDirection();
			player.move(direction);
			compass = new Compass(player,treasure);
			if (compass.isOnTreasure()) foundTreasure();
		}
	}
	
	public void getOrder() {
		System.out.println("Which way would you like to move? ");
		
	}
	
	public void foundTreasure() {
		System.out.println("You found the treasure!");
		System.out.println("Well done.");
		isFinished = true;
	}
	
	public void setDirection() {
		this.direction = ' ';
		String input;
		while (this.direction == ' ') {
			System.out.println("Please pick direction: (N)orth, (E)ast, (S)outh or (W)est. ");

			input = Utils.getInput();
			
			
			
			this.direction = DirectionSimplifier.getDirection(input);
		}
		
	}
	
	
}
