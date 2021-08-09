package javaStringPrograms;

import java.util.Scanner;

public class IntegerToString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		int i=sc.nextInt();
		String s1=i+"";
		System.out.println(s1);
	}
}
