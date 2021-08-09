package javaStringPrograms;

import java.util.Scanner;

public class AddAllDigitsInString 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch =s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count=count+Character.getNumericValue(ch);
			}
			
		}
		System.out.println("sum of the digits present in given String is: "+count);
	}
}
