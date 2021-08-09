package javaStringPrograms;

import java.util.Scanner;

public class RemoveVowels 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			 if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			 {
				 System.out.print(ch);	 
			 }
		} 
	}
}
