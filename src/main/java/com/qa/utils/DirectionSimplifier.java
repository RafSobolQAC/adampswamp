package com.qa.utils;

public class DirectionSimplifier {
	
		
	public static char getDirection(String dir) {
		char ret;
		char firstLetter = dir.substring(0,1).toCharArray()[0];
		if (firstLetter=='e' || firstLetter=='w' || firstLetter == 'n' || firstLetter == 's') {
			ret = firstLetter;
		}
		else ret = ' ';
		return ret;
		
	}
	
}
