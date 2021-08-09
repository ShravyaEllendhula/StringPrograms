package strings;

import java.util.Scanner;

public class CountNoOfWordsInString 
{
	public static void main(String[]args)
	{
		 int count=0;
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.nextLine();
		 String s2[]=s1.split("\\s+");
		 for(int i=0;i<=s2.length-1;i++)
		 {
			count++; 
		 }
		 System.out.println(count);
		 
	}
}
