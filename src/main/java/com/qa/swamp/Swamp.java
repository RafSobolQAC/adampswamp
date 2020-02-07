package com.qa.swamp;

import com.qa.map.MapSetUpper;
import com.qa.map.Treasure;
import com.qa.pda.Compass;
import com.qa.utils.DirectionSimplifier;
import com.qa.utils.Utils;

public class Swamp {
	private boolean isFinished = false;
	private Player player;
	private Treasure treasure;
 	private char direction;
	private Compass compass;
	
	/**
	 * Creates the swamp.
	 * @param mapSetup the MapSetUpper object.
	 */
	public Swamp(MapSetUpper mapSetup) {
		this.player = mapSetup.getPlayer();
		this.treasure = mapSetup.getTreasure();
	}
	/**
	 * Initial method called by the Runner.
	 */
	public void begin() {
		System.out.println("You find yourself in the middle of a swamp.");
		System.out.println("You look around, wondering if you're dreaming. Just moments ago you were sat in a warm ");
		System.out.println("Salford office, counting down the days to your next payday in your head; now, you are ");
		System.out.println("standing knees-deep in mud. You don't even have the time to worry about how you will ");
		System.out.println("have to splash out on some new shoes, or whether your fancy new trousers will survive ");
		System.out.println("this lovely little mudbath; indeed, you are rather busy being extremely confused at what");
		System.out.println("in the hell is going on. ");
		
		System.out.println("\n");

		Utils.delayer();
		System.out.println("You pull your phone out of the left-front pocket of your jeans. You look down at it, and ");
		System.out.println("you unlock the-");
		System.out.println("Hold on, this isn't your phone.");
		System.out.println("\n");
		Utils.delayer();
		
		System.out.println("\'Hello!\'");
		System.out.println("The little creature in your pocket exclaims, seemingly unbothered by the fact it just got");
		System.out.println("pulled out of a stranger's pocket.");
		System.out.println("It appears to be something akin to a squirrel, if a squirrel were put through a hydraulic");
		System.out.println("press. It's approximately rectangular when you look at it from the front");
		System.out.println("'I am your Portable Damp-area Assistant! Just call me PDA for short.'");
		System.out.println("Here, your PDA trailed off, as the game developer's imagination has dried out.");
		System.out.println("And thus, you set off on your epic adventure of finding the treasure!");
		compass = new Compass(player,treasure);
		keepGoing();

	}
	
	/**
	 * Main method responsible for running the game.
	 * Orchestrates the other methods.
	 */
	public void keepGoing() {
		while (!isFinished) {
			setDirection();
			player.move(direction);
			compass = new Compass(player,treasure);
			if (compass.isOnTreasure()) foundTreasure();
		}
	}
	/**
	 * Currently unused.
	 * Will allow for player to do actions other than moving.
	 */
	public void getOrder() {
		System.out.println("What would you like to do? ");
		System.out.println("(M)ove (I)nventory (Q)uit");
		
	}
	
	public void foundTreasure() {
		System.out.println("You found the treasure!");
		System.out.println("Well done.");
		System.out.println("You should be very proud of yourself!");
		System.out.println("Your skills at typing out letters are truly remarkable.");
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
