package javaStringPrograms;

import java.util.Scanner;

public class DuplicateCharPrint //when single word is given is given
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			int k=s2.indexOf(ch);
			if(k==-1)
			{
				s2=s2+ch;
			}
		}
		for(int x=0;x<=s2.length()-1;x++)
		{
			int count =0;
			char ch1=s2.charAt(x);
			for(int y=0;y<=s1.length()-1;y++)
			{
				char ch2=s1.charAt(y);
				if(ch1==ch2)
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(ch1);
			}
		}	 
	}
}
