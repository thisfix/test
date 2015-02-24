package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class Rot13Test.
 */
public class Rot13Test {
	
	/** The Constant TEST_STRING. */
	private static final String TEST_STRING = "Hello there. Testing, testing!";
	
	/** The Constant TEST_STRING_ENCRYPTED. */
	private static final String TEST_STRING_ENCRYPTED = "Uryyb gurer. Grfgvat, grfgvat!";

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		assertEquals(Rot13.encrypt(TEST_STRING), TEST_STRING_ENCRYPTED);
	}

}
