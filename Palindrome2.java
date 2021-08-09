package stringClass;

import java.util.Scanner;

public class Palindrome2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.next();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		if(s.equals(s1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
