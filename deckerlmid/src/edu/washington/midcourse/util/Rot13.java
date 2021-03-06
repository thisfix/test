package edu.washington.midcourse.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Rot13.
 */
public class Rot13 {
	
	/**
	 * Encrypt.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String encrypt(String str){
		char[] values = str.toCharArray();
		for (int i = 0; i < values.length; i++) {
		    char letter = values[i];

		    if (letter >= 'a' && letter <= 'z') {
		    	// Rotate lowercase letters.
				if (letter > 'm') {
				    letter -= 13;
				} else {
				    letter += 13;
				}
		    } else if (letter >= 'A' && letter <= 'Z') {
		    	// Rotate uppercase letters.
				if (letter > 'M') {
				    letter -= 13;
				} else {
				    letter += 13;
				}
		    }
		    values[i] = letter;
		}
		// Convert array to a new String.
		return new String(values);
	}

}
