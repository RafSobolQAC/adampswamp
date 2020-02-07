package com.qa;

import com.qa.map.MapSetUpper;
import com.qa.swamp.Swamp;

public class Runner {
	
	public static void main(String[] args) throws InterruptedException{
		MapSetUpper mapSetup = new MapSetUpper();
		Swamp swamp = new Swamp(mapSetup);
		swamp.begin();	

	}

}

