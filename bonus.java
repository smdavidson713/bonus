/* Sydney Davidson
   CSI 201
   Bonus Assignment
   Lab Section: Friday 10:25 Jouse Ruiz */

/* This program reads a file from user
   and reads the first letter of every
   fifth word to print out a message */

import java.util.Scanner;
import java.io.*;         
import java.lang.String;
import java.lang.StringBuilder;

public class bonus{
	public static void main(String[] args)throws IOException 
	{
		String fileName;  // Declares the variable 'fileName' as a String
		String line;      // Declares the variable 'line' as a String
		char x;           // Declares the variable 'x' as a character

		StringBuilder sb = new StringBuilder();    // Creates Stringbuilder object
		Scanner keyboard = new Scanner(System.in); // Creates new scanner object

		System.out.println("Please enter the text file name: "); // Asks user for the name of their text file
		fileName = keyboard.nextLine();                          // fileName is the variable for the text file the user inputs

		if(!fileName.contains(".txt")){                          // If the file is not a text file
			System.out.println("You did not enter a text file."); // notifies the user if the file is not the correct type
			System.exit(0);                                       // quits the program
		}
	
		FileReader fr = new FileReader(fileName);                // Reads the file
		BufferedReader br = new BufferedReader(fr);              // Reads the file line by line

		line = br.readLine();                                    // Stores the lines of the file into the variable 'line'

		String[] firstLine = line.split(" ");                    // Divides the lines of the file by word with a space delimiter
		                                                         // and stores into an array 
		int wordCount = 5;                                       // Keeps track of the words in the file to make sure every
															     // every fifth word is accounted for

		for(int i = 0; i < firstLine.length; i++){                 // Loops through the file
			if(wordCount == 5){                                    // for every fifth word
				x = Character.toUpperCase(firstLine[i].charAt(0)); // take the first letter and capitalize it
				wordCount = 1;

				sb.append(x);                                      // Adds each leter to the stringbuilder
				}
			else{
					wordCount++;
				}
		}

		System.out.println(sb);                                   // Prints out the word from the file

	}
}