package javaStringPrograms;

import java.util.Scanner;

public class PrintAsciiValueOfString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
		System.out.println("Ascii value of '"+ch+"': "+(int)ch);
		} 
	}
}
