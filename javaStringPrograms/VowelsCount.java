package javaStringPrograms;

import java.util.Scanner;

public class VowelsCount 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		int ac=0;
		int ec=0;
		int ic=0;
		int oc=0;
		int uc=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a')
			{
				ac++;
			}
			else if(ch=='e')
			{
				ec++;
			}
			else if(ch=='i')
			{
				ic++;
			}
			else if(ch=='o')
			{
				oc++;
			}
			else if(ch=='u')
			{
				uc++;
			}
		
		}
		System.out.println("no of 'a' are present is given string is: "+ac);
		System.out.println("no of 'e' are present is given string is: "+ec);
		System.out.println("no of 'i' are present is given string is: "+ic);
		System.out.println("no of 'o' are present is given string is: "+oc);
		System.out.println("no of 'u' are present is given string is: "+uc);
	
	}
}
