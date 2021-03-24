package extraCredit04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//write  a program that will take in a list of words and output 2 of said words on each row in the order they were received


	public class NameSorter {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			// Get the input file name
			System.out.println("What is the file that has the names in it. Enter in this form\n C:\\Users\\YourUserName\\eclipse-workspace\\Chapter09\\src\\extraCredit04\\input.txt");
			String infileName = scanner.nextLine().trim();
			// Get the output file name
			System.out.println("What is the file to write to? Enter in the same format as above.");
			String outfileName = scanner.nextLine().trim();
			
			// Get input file
			Scanner inputFile = null;
			try {
				inputFile = new Scanner(new File(infileName));
			} catch (FileNotFoundException ex) {
				System.out.println("Error opening the input file " + infileName + ". Can not locate");
				System.exit(0);
			}//ending bracket for catch statement
			// Get output file
			PrintWriter outputFile = null;
			try {
				outputFile = new PrintWriter(new File(outfileName));
			} catch (FileNotFoundException ex) {
				System.out.println("Error opening the output file " + outfileName + ". Can not locate");
				System.exit(0);
			}//ending bracket for catch statement
			
			String first = "";
			String last = "";
			boolean haveFirstName = false;
			// Get the names
			while(inputFile.hasNextLine()){
				String line = inputFile.nextLine();
				Scanner lineScanner = new Scanner(line);
				while(lineScanner.hasNext()){
					if(!haveFirstName){
						first = lineScanner.next();
						haveFirstName = true;
					} else {
						last = lineScanner.next();
						outputFile.println(first + " " + last);
						haveFirstName = false;
					}//ending bracket of else statement
				}//ending bracket of while loop
			}//ending bracket of while loop
			inputFile.close();
			outputFile.close();
			scanner.close();
			System.out.println("Fixed \"Mr. Funny Sense of Humor's\" File Program }:(  ");
		}//ending bracket of 
	}//ending bracket of CLASS namesorter