package com.textmanipulation;

/**
 * @author Jagoda Los
 * 
 *   Class PalindromeChecker verifies if our String word is a palindrome
 *   or if it is not. Palindrome is a word which reads the same backward or forward
 */

public class PalindromeChecker {

	public static String word = "Redker";
	// public static String word = "Wow";

/**
*    The method isPalindrome uses the method reverseText to compare whether the text is the same forward and backward
*/

	public static boolean isPalindrome(String text) {
		return text.toLowerCase().equals(StringReverserAndCounter.reverseText(text.toLowerCase()));
	}

	public static void main(String[] args) {
		System.out.println("PROGRAM -PALINDROME CHECKER");
		System.out.println();
		System.out.println("Your word: " + word);
		System.out.println(isPalindrome(word));
		if (isPalindrome(word) == true) {
			System.out.println("Your word is a palindrome !");
		} else {
			System.out.println("Your word is not a palindrome !");
		}
	}
}
