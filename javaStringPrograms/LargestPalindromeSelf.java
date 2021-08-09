package javaStringPrograms;

import java.util.Scanner;

public class LargestPalindromeSelf 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Sentence");
		String s1=sc.nextLine();
		String sArr[]=s1.split(" ");
		int big=sArr[0].length();
		int index=0;
		for(int i=1;i<=sArr.length-1;i++)
		{
			int tempBig=sArr[i].length();
			if(tempBig>big)
			{
				big=tempBig;
				index=i;
			}
		}
		if(palindrome1(sArr[index]))
		{
			System.out.println("palindrome: "+sArr[index]);
		}
		else
		{
			System.out.println("there are no palidorme");
		}
	}
	public static boolean palindrome1(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		if(s1.equalsIgnoreCase(s2))
		{
			return true;
		}
		return false;
	}

}
