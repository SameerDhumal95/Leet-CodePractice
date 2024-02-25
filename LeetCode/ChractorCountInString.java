package LeetCode;

public class ChractorCountInString {

	public static void main(String[] args) {
		
		String str = "JayShreeRam";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			count = 0;
			char c = str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				char ch = str.charAt(j);
				if(j<i&&ch==c)
				{
					break;
				}
				if(ch==c)
				{
					count++;
				}
				
			}
			if(count!=0)
			{
				System.out.println("Charactor "+c+" : "+count);
			}
		}
	}

}
