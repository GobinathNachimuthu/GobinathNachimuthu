package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "stops"; // Declare a String String text1 = "stops";
		String s2 = "potss"; // Declare another String String text2* = "";
		if (s1.length() == s2.length()) // a) Check length of the strings are same then (Use A Condition)
		{

			char[] text1 = s1.toLowerCase().toCharArray();// Sort Both the arrays
			char[] text2 = s2.toLowerCase().toCharArray();// Sort Both the arrays

			Arrays.sort(text1);
			Arrays.sort(text2);

			if (s1 != s2) {// d) Check both the arrays has same value

				System.out.println(s1 + " and " + s2 + " are Anagram.");

			} else
				System.out.println(s1 + " and " + s2 + " are Not Anagram.");
			{

			}
		}

	}

}
