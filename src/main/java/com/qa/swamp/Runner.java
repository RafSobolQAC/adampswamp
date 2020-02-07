package com.qa.swamp;

import com.qa.map.MapSetUpper;

public class Runner {
	
	public static void main(String[] args) throws InterruptedException{
		MapSetUpper mapSetup = new MapSetUpper();
			
		
		Swamp swamp = new Swamp(mapSetup);
		swamp.begin();
//		Compass compass = new Compass(player,treasure);
		
	

	}

}

