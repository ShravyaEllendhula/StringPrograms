package javaStringPrograms;

import java.util.Scanner;

public class CompareTwoStrings
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st String");
		String s1=sc.nextLine();
		System.out.println("enter 2nd String");
		String s2=sc.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else	
		{
			System.out.println("not equal");
		}
		//equalsIgnoreCase
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}
		
}
