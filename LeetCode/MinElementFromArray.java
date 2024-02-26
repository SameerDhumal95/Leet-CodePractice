package LeetCode;

public class MinElementFromArray {

	public static void main(String[] args) {
		 int[] arr = {5,8,4,1,7,16,20,15,18};
		 
		 int min = arr[1];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<min)
			 {
				 min = arr[i];
				
			 }
		 }
		 System.out.println("Min element is: "+min);

	}

}
