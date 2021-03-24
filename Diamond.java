package eXTRAcREDIT03;
//Finished 9-11-11-2020   ~9:20PM EST
//jACOB c. vAUGHT
//DuE 11-16-2020
import java.util.Scanner;

public class Diamond {
	private static int convert_String_To_Number(String input) {
		char letter=input.charAt(0);
		int number=letter;
		return number;
	}
	public static int NUMBER_OF_A_IN_ASCII=65;	
	public static void main(String[] args) {
		// Declare and Instantiate scanner object
		Scanner keyboard = new Scanner (System.in);
		// Prompt for and obtain n from the user
		System.out.println("Hi professor, this uses ASCII, so if you enter a \nlowercase letter it will make a bigger diamond ");
		System.out.print("If c=");
		String inPut = keyboard.next();
		int number = convert_String_To_Number(inPut)-NUMBER_OF_A_IN_ASCII;
		for(int i = -number; i <= number; ++i) {
			for(int spaces = 0; spaces < Math.abs(i); ++spaces) {
				System.out.print(" ");
			}// Ending bracket of INNER spaces for loop
			for(int blocks = 0; blocks < (number - Math.abs(i)); ++blocks) {
				System.out.print((char)(blocks+NUMBER_OF_A_IN_ASCII));
			}// Ending bracket of INNER blocks for loop
			for(int blocksReversed = number - Math.abs(i); blocksReversed >= (0); --blocksReversed) {
				System.out.print((char)(blocksReversed+NUMBER_OF_A_IN_ASCII));
			}
			//new Line
			System.out.println();
		}// Ending bracket of OUTER for loop
		// Close the scanner object
		keyboard. close();
	}// Ending bracket of method main
	}// Ending bracket of class Diamond Loop package project07;

