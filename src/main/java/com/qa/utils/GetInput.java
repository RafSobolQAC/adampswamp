package com.qa.utils;

import java.util.Scanner;

public class GetInput {
	public static String getInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
