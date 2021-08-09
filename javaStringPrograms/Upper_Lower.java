package javaStringPrograms;

import java.util.Scanner;

public class Upper_Lower 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine();
		String us=s1.toUpperCase();
		String ls=s1.toLowerCase();
		System.out.println("Original String"+s1);
		System.out.println("Original in upper case"+us);
		System.out.println("Original in lower case"+ls);
		
	}
}
