package javaStringPrograms;

import java.util.Scanner;

public class FindAWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Sentence");
		String s1=sc.nextLine();
		System.out.println("enter a word");
		String s2=sc.next();
		if(s1.contains(s2))
		{
			System.out.println("the string "+s2+" is present in given sentence"+s1);
		}
		else
		{
			System.out.println( "the string "+s2+" is not present in given sentence"+s1);
		}
	}
}
