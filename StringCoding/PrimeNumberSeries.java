package StringCoding;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		int s = 1;
		int e = 20;
		if(s==0||s==1)
		{
			s=2;
		}
		for(int i=s;i<=e;i++)
		{
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(i+",");
			}
		}
	}



}
