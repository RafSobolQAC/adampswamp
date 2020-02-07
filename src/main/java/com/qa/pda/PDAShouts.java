package com.qa.pda;

public enum PDAShouts {

	
	ONE("'You're doing well! You're only "),
	TWO("'Don't stop now! You're only "),
	THREE("'That's a great spot in the swamp! My first date was right here. I like it, because the treasure is only ");
	
	String shout;
	public String getShout() {
		return shout;
	}
	
	PDAShouts(String shout) {
		this.shout = shout;
	}
}
