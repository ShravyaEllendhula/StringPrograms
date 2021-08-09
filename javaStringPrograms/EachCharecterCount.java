package javaStringPrograms;

import java.util.Scanner;

public class EachCharecterCount 
{
	public static void main(String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine().replaceAll(" ", "");
		System.out.println("enter a charecter");
		char ch=sc.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++) 
		{
			char ch1=s1.charAt(i);
			if(ch1==s1.charAt(s1.indexOf(ch)))
			{
				count++;
			}
		}
		int firstI = s1.indexOf(ch);
        int lastI = s1.lastIndexOf(ch);
        int distance=(lastI-firstI);
        int fdis=distance-count+1;
        System.out.println("given string is: "+s1+ "\nFirst i: "+ firstI+"\nLast i: "+ lastI+"\nDistance: "+fdis);
	}
}
