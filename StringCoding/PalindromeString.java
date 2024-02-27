package StringCoding;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next().toLowerCase();
		String rstr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rstr = rstr + str.charAt(i);
		}
		if(rstr.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
