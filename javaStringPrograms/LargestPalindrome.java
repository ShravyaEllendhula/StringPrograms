package javaStringPrograms;

import java.util.Scanner;

public class LargestPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Sentence");
		String s1=sc.nextLine();
		String[] sArr = s1.split(" ");
		int big= sArr[0].length();
		int index=0;
		for(int i=0;i<=sArr.length-1;i++)
		{
			int tempbig=sArr[i].length();
			if(tempbig>big)
			{
				big=tempbig;
				index=i;
			}
			 
		}
		if(palindrome1(sArr[index]))
		{
			System.out.println("the lagest palindrome: "+sArr[index]);
		}
		else
		{
			System.out.println("there is no palindrome");
		}
	}
	public static boolean palindrome1(String s1)
	{
		{
			if(s1.length()==1)
			{
				return true;
			}
			 if(s1.charAt(0)==s1.charAt(s1.length()-1))
			{
				return palindrome1(s1.substring(1,s1.length()-1));
			}
			return false;
		}
	}
}
