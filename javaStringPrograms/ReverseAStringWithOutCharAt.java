package javaStringPrograms;

import java.util.Scanner;

public class ReverseAStringWithOutCharAt 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			 System.out.print(ch[i]);
		}
	}
}
