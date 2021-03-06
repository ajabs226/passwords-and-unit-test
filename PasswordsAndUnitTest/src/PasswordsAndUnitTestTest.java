import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordsAndUnitTestTest {

	@Test
	void testValidity() {
		String password = "PAssIng1234";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testValidity2() {
		String password = "fail1234";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testLength() {
		String password = "lEngthtEst1";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testLength2() {
		String password = "pAsswOrdfA1ls";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoSix() {
		String password = "nOsIx123";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testWithSix() {
		String password = "WIthSIx6";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTwoCapitalVowels() {
		String password = "twOCAps1";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTwoCapitalVowels2() {
		String password = "nocaps123";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdmin() {
		String password = "admin";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMod() {
		String password = "mod";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoSpaces() {
		String password = "SpAce SpAce1";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoSpaces2() {
		String password = "MO rE SpAce";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRepeats() {
		String password = "twOCAps1";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRepeats2() {
		String password = "admin";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTest.addPassword(password);
		assertEquals(expected, actual);
	}

}
