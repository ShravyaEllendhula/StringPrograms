package javaStringPrograms;

import java.util.Scanner;

public class StringToInteger 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		int k=Integer.parseInt(s1);
		System.out.println(k);
	}
}
