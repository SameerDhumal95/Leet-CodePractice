package ArraysCoding;

public class SelectionSortArray {

	public static void main(String[] args) {
		//SELECTION SORT
		int[] arr = {2,5,3,8,1,9,15,73,4,12};
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])//2>1
				{
				temp = arr[i];//2
				arr[i]=arr[j];//1
				arr[j]=temp;//1
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
