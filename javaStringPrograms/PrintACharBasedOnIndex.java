package javaStringPrograms;

import java.util.Scanner;

public class PrintACharBasedOnIndex 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch+" @ "+i+ "index:");
		}
		System.out.println("enter an index");
		int index=sc.nextInt();
		char ch=s1.charAt(index);
		System.out.println("the desired charecter is:"+ch);
		 
	}
}
