package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}
	
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}

}
