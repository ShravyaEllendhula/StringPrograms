package javaStringPrograms;

import java.util.Scanner;

public class GivenCharCount
{
	public static void main(String[] args)
	{
		//String s1="developer";
		//char ch='e';
		int status=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		System.out.println("enter a charecter to search");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==ch2)
			{
				status++;
			}
		}
			if(status>0)
			{
				System.out.println("the no of repeated count is:"+status);
			}
			else
				
			{
				System.out.println("not found");
			}
		
	}
}
