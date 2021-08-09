package javaStringPrograms;

import java.util.Scanner;

public class ConvertStringToCharArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			 System.out.print(ch[i]);
		}
	}
}
