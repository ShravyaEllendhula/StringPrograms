package javaStringPrograms;

import java.util.Scanner;

public class CountNoOfWords 
{
	public static void main(String[]args)
	{
		 int count=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a String");
		 String s1=sc.nextLine();
		 String s2[]=s1.split("\\s+");
		 for(int i=0;i<=s2.length-1;i++)
		 {
			count++; 
		 }
		 System.out.println("the no of words present in given string is: "+count);
		 
	}
}
