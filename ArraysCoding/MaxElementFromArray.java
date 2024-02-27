package ArraysCoding;

public class MaxElementFromArray {

	public static void main(String[] args) {
		 int[] arr = {5,8,4,1,7,16,20,15,18};
		 
		 int max = arr[1];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max = arr[i];
				
			 }
		 }
		 System.out.println("Max element is: "+max);

	}

}
