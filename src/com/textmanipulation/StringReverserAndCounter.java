package com.textmanipulation;

import java.util.Scanner;

/**
 * @author Jagoda Los
 * 
 *         Class StringReverserAndCounter counts how many words we have typed
 *         and print it backwards on the console
 */

public class StringReverserAndCounter {

	private static Scanner scrString = new Scanner(System.in);
	public static char[] word;

	/**
	 * The method is printing a given word backward.
	 */

	public static String reverseText(String text) {
		word = text.toCharArray();
		char mark;
		int firstLetter = 0;
		int lastLetter = word.length - 1;
		while (lastLetter > firstLetter) {
			mark = word[firstLetter];
			word[firstLetter] = word[lastLetter];
			word[lastLetter] = mark;
			lastLetter--;
			firstLetter++;
		}
		return new String(word);
	}

	/**
	 * Output : Enter the string : jagoda 
	 * String before reverse: jagoda 
	 * String after reverse: adogaj
	 * 
	 * @return word backward
	 */

	public static void main(String[] args) {
		System.out.println("PROGRAM - STRING REVERSER/ WORD COUNTER");
		System.out.println("Enter your word/s: ");
		String text = scrString.nextLine();
		System.out.println(StringReverserAndCounter.reverseText(text));
		System.out.println("Number of words: ");
		System.out.print(text.split(" ").length);
	}
}
