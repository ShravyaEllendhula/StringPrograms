package stringClass;

import java.util.Scanner;

public class CountAlphabets 
{
	public static void main(String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
				if(Character.isAlphabetic(s1.charAt(i)))
				{
					count++;
				}
		}
			System.out.println("the total alphabets present in a gievn string is: "+count);
			 		 
		}
		
	}
	

