package javaStringPrograms;

import java.util.Scanner;

public class CountNoOfDigitss 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println("the no of digits are: "+count);
	}

}
