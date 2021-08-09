package javaStringPrograms;

import java.util.Scanner;

public class FindOutLengthWithoutLengthMethod 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		int count=0;
		int i=0;
		while(true)
		{
			try
			{
				s1.charAt(i);
				count++;
				i++;
			}
			catch(StringIndexOutOfBoundsException rv)
			{
				break;
			}
		}
		System.out.println("the length of the given String is: "+count);
		
	}
}
