package warmup;

import java.util.Scanner;
import java.util.stream.IntStream;



public class Palindrome {

	static Boolean plaindromeChecker1(String input)
	{
		String palindrome = input.toLowerCase();

		int size = palindrome.length();
		boolean flag = true;

		for (int i = 0, j=size-1;  i <= size/2;i++, j--)
		{
			if(palindrome.charAt(i)!=palindrome.charAt(j))
			{
				flag=false;
				break;
			}
		}

		return flag;
	}

	static Boolean plaindromeChecker2(String input)
	{
		String normalized = input.toLowerCase();
		int size = normalized.length();

		return IntStream.range(0, size/2).allMatch(i -> normalized.charAt(i) == normalized.charAt(size-i-1));
	}

	static Boolean plaindromeChecker3(String input)
	{
		String normalized = input.toLowerCase();
		String reveresed = new StringBuilder(normalized).reverse().toString();
		String reveresed1 = new StringBuffer(normalized).reverse().toString();


		return normalized.equals(reveresed1);
	}

	/*
	 * static Boolean plaindromeChecker4(String input) { String normalized =
	 * input.toLowerCase(); // String reveresed = Utilities.reverse();
	 * 
	 * 
	 * return normalized.equals(reveresed); }
	 */
	public static String removeSpecialChar(String s) {
		String res = "";

		/*
		 * for(int i=0;i<s.length();i++) { char ch = s.charAt(i);
		 * 
		 * if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >='0' &&
		 * ch<='9')) { res += ch; } else continue; }
		 */

		s = s.replaceAll("[^a-zA-Z0-9]", "");  

		return s;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); 
		String input1 = scn.nextLine();
		String input = removeSpecialChar(input1);

		System.out.println("String is after removing special char :" + input);

		// 1st method
		System.out.println("String is Palindrome :" + plaindromeChecker1(input));


		// 2nd method
		System.out.println("String is Palindrome :" + plaindromeChecker2(input));

		//3rd method
		System.out.println("String is Palindrome :" + plaindromeChecker3(input));


		//4th method
		System.out.println("String is after removing special char :" + removeSpecialChar(input));
	}
}
