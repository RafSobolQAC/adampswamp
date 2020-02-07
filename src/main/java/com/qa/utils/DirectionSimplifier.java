package com.qa.utils;

public class DirectionSimplifier {
	
		
	public static char getDirection(String dir) throws StringIndexOutOfBoundsException {
		char ret;
		if (dir.length() == 0) return ' ';
		char firstLetter = dir.substring(0,1).toLowerCase().toCharArray()[0];
		if (firstLetter=='e' || firstLetter=='w' || firstLetter == 'n' || firstLetter == 's') {
			ret = firstLetter;
		}
		else ret = ' ';
		return ret;
		
	}
	
}
