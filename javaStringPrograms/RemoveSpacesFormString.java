package javaStringPrograms;

import java.util.Scanner;

public class RemoveSpacesFormString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine();
		String s2=s1.replaceAll(" ","");
		System.out.println(s2);
		 
		
	}
		
}

