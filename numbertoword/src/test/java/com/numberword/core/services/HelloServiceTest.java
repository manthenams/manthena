package com.numberword.core.services;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelloServiceTest {   

 @Test
    void testGet() {
int number = 10;
	//	Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		try {
			// read the number
			//number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {		
      assertEquals("ten",ConvertServiceImpl.getInstance().numberToWord(number));

			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		// close the reader
	//	scanner.close();
        
    }

}
