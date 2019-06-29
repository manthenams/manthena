package com.numberword.core.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloServiceTest {   
static ConvertServiceImpl convert=new ConvertServiceImpl();

 @Test
    void testGet() {
int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		try {
			// read the number
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {				assertEquals("one",convert.numberToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		// close the reader
		scanner.close();
        
    }

}