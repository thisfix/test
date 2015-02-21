package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot13;

public class Main {
	public static void main(String[] args){
		String encryptedString = "";
		encryptedString = Rot13.encrypt(args[0]);
		System.out.println("Standard String = "+args[0]);
		System.out.println("Encrypted String = "+encryptedString);
	}

}
