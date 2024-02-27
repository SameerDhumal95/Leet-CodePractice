package StrinCoding;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int num = 23;
		boolean flag = false;
		if(num==0||num==1)
		{
			num=2;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=true;
				}
			}
			if(flag)
			{
				System.out.println("Not Prime");
			}
			else
			{
				System.out.println("Prime");
			}
		}
		

	}

}
