package javaStringPrograms;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				String ds=ch+"";
				int k=Integer.parseInt(ds);
				sum=sum+k;
			}
		}
		System.out.println(sum);
	}
}
