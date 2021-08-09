package strings;

import java.util.Scanner;

public class StringTest 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ur 1st input"); 
	String s1=sc.nextLine();
	System.out.println("eter 2nd input");
	String s2=sc.nextLine();
	System.out.println("enter ue 3rd input");
	String s3=sc.nextLine();
	
	
	
	
	
	
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		if(Character.isDigit(s1.charAt(i)))
		{
			 System.out.println(s1);
		}
		
	}
	for(int i=0;i<s2.length();i++)
	{
		if(Character.isDigit(s2.charAt(i)))
		{
			System.out.println(s2);
		}
		
		
	}
	for(int i=0;i<s3.length();i++)
	{
		if(Character.isDigit(s3.charAt(i)))
		{
			System.out.println(s3);
		}
		
		
		
	}
	
	
	}
	
}
