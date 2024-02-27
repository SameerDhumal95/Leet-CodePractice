package StringCoding;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		int num = x;
	      int sum =0;
	      while(num>0)
	      {
	          int n = num%10;
	          sum = sum * 10 + n;
	          num = num / 10;
	      }
	      if(sum==x)
	      {
	          System.out.println("Palindrome");
	      }
	      else
	      {
	    	  System.out.println("Not Palindrome");
	      }

	}

}
