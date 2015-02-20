package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot13;

public class Main {
	void main(String str){
		String encryptedString = "";
		encryptedString = Rot13.encrypt(str);
		System.out.println("Standard String = "+str);
		System.out.println("Encrypted String = "+encryptedString);
	}

}
