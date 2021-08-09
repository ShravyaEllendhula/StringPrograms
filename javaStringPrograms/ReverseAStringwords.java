package javaStringPrograms;

import java.util.Scanner;

public class ReverseAStringwords 
{
	public static void main(String[] args)
	{	 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine();
		String[]s2=s1.split(" ");
		String s3=" ";
		s3=s2[s2.length-1];
		for(int i=s2.length-2;i>=0;i--)
		{
			s3=s3+" "+s2[i];
		}
		System.out.println(s1);
		System.out.println(s3);
	}
	
}
