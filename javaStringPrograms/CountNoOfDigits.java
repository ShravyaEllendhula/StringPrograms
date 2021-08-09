package javaStringPrograms;

import java.util.Scanner;

public class CountNoOfDigits 
{
	public static void main(String[] args)
	{
		int count=0;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				count=count+Character.getNumericValue(i);
			}
		}
		System.out.println(count);
		
	}
}
