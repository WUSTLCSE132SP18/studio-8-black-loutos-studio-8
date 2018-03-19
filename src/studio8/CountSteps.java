package studio8;

import java.util.Scanner;
import java.io.*;



// TODO: Develop an algorithm to count steps in accelerometer dat
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps{
	public static void main(String args[]) {
		try {
		
		File txt =   new File("/Users/mitchellblack/Documents/Wash U SP18/CSE 132/item.csv");
		Scanner in = new Scanner(txt);
		
		if(txt.canRead()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}