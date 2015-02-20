package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Rot13Test {
	private static final String TEST_STRING = "Hello there. Testing, testing!";
	private static final String TEST_STRING_ENCRYPTED = "Uryyb gurer. Grfgvat, grfgvat!";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(Rot13.encrypt(TEST_STRING), TEST_STRING_ENCRYPTED);
	}

}
