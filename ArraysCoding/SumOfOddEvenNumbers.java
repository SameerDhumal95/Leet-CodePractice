package ArraysCoding;

public class SumOfOddEvenNumbers {

	public static void main(String[] args) {
	
		int[] arr = {2,5,3,8,1,9,15,73,4,12};
		int even = 0;
		int odd = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even = even + arr[i];
			}
			else if(arr[i]%2!=0)
			{
				odd = odd + arr[i];
			}
		}
		System.out.println("Sum of Even Numbers: "+even);
		System.out.println("Sum of Odd Numbers: "+odd);
		

	}

}
