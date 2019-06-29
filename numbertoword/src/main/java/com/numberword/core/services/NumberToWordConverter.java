package com.numberword.core.services;

import java.util.Scanner;
 
public class NumberToWordConverter {
 	public static void main(String[] args) {
		int number = 56945781;
System.out.print("Number in words: " +  ConvertServiceImpl.getInstance().numberToWord(number));
		/* Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		try {
			// read the number
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " +  ConvertServiceImpl.getInstance().numberToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		// close the reader
		scanner.close(); */
	}
 
 
}
