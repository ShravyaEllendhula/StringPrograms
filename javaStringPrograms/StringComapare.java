package javaStringPrograms;

import java.util.Scanner;

public class StringComapare 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String");
	String s1=sc.nextLine();
	System.out.println("enter a String");
	String s2=sc.nextLine();
	if(s1.equals(s2))
	{
		System.out.println("given strings are equal");
	}
	else
	{
		System.out.println("given strings are not equal");
	}
}
}
