package javaStringPrograms;

import java.util.Scanner;

public class CharSearchWithIndex 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=sc.nextLine();
	System.out.println("enter a charecter");
	char ch=sc.next().charAt(0);
	int index=s1.indexOf(ch);
	if(index==-1)
	{
		System.out.println("the given char is not present");
	}
	else
	{
		System.out.println("the given char is  present at index:"+index);
	}
}
}
