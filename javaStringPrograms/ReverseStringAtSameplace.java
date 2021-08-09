package javaStringPrograms;

import java.util.Scanner;

public class ReverseStringAtSameplace 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Sentence");
		String s1=sc.nextLine();
		String[] sArr=s1.split(" ");
		String s3=ReverseString(sArr[0]);
		for(int i=1;i<=sArr.length-1;i++)
		{
			String tempString=ReverseString(sArr[i]);
			s3=s3+" "+tempString;
		}
		System.out.println("given String   : "+s1);
		System.out.println("Reversed String: "+s3);
		
		
	}
	public static String ReverseString(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		return s2;
	}
}
