package ArraysCoding;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		 int[] arr = {1,5,2,3,1,5,5,6,9,3};
		 Arrays.sort(arr);
		 int n = arr.length;
		 int[] temp = new int[arr.length];
		
		 int j=0;
		 for(int i=0;i<arr.length-1;i++) 
		 {
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		 }
         
		 temp[j++]=arr[n-1];
		 for(int i=0;i<j;i++)
		 {
			 System.out.println(temp[i]);
		 }
	}

}
