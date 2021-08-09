package javaStringPrograms;

import java.util.Scanner;

public class RemoveSpacesAtTheEnds 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String with spaces at the ends");
		String s1=sc.nextLine();
		System.out.println(s1.trim());
	}
}

