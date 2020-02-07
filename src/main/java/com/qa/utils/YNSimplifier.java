package com.qa.utils;

public class YNSimplifier {
	
	public static char getPermission(String yesNo) throws StringIndexOutOfBoundsException {
		char ret;
		if (yesNo.length() == 0) return ' ';
		char firstLetter = yesNo.substring(0,1).toLowerCase().toCharArray()[0];
		if (firstLetter=='y' || firstLetter=='n') {
			ret = firstLetter;
		}
		else ret = ' ';
		return ret;
		
	}

}
