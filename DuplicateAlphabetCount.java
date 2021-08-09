package stringClass;

import java.util.Scanner;

public class DuplicateAlphabetCount 
{
	public static void main(String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine();
		System.out.println("enter a charecter");
		char ch=sc.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++) 
		{
			if(s1.charAt(i)==s1.charAt(s1.indexOf(ch)))
			{
				count++;
			}
		}
		System.out.println("no of repead times is:"+count);	
	}
}
