/*
 * Developer: Alexander Vernet
 * Name: FizzBuzz.java
 * Date: 7/21/2016
 * Purpose: This program runs a loop for 110 iterations, and prints out either the value of 
 * int i, "Fizz", "Buzz", "Bang", or some combination of those three Strings based on set criteria.
 * 
 * 
 * Developer's note: I am aware of how to solve the FizzBuzzBang problem using the && operators, followed 
 * by a series of else-if statements.  I decided to find an alternate route to the solution.  The program works
 * successfully.
 */


package com.vernet;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 110; i > 0; i--){
			
			if(!(i % 3 == 0 || i % 5 == 0 || i % 7 == 0))
			{
				System.out.print(i);
			}
			
			else
			{
				if(i % 3 == 0){
					System.out.print("Fizz");
				}
				
				if(i % 5 == 0){
					System.out.print("Buzz");
				}
			
				if(i % 7 == 0){
					System.out.print("Bang");
				}
			}
			
			System.out.print("\n");		
		}
	}

}
