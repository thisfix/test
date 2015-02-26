package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot13;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		if (args.length > 1){
			System.out.println("Please enter only one arguement");
		} else {
			String encryptedString = "";
			encryptedString = Rot13.encrypt(args[0]);
			System.out.println("Standard String = "+args[0]);
			System.out.println("Encrypted String = "+encryptedString);
		}
	}

}
