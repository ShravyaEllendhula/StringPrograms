package javaStringPrograms;

import java.util.Scanner;

public class CharecterChecking
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		System.out.println("enter a charecter to be searched");
		char ch=sc.next().charAt(0);
		int status=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch1=s1.charAt(i);
			if(ch==ch1)
			{
			    status=1;
				break;
			}
		}
		if(status==1) 
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
}
