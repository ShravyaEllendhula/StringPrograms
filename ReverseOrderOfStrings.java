package strings;

import java.util.Scanner;

public class ReverseOrderOfStrings 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		String s2="";
		String sArray[]=s1.split(" ");
		for(int i=sArray.length-1;i>=0;i--)
		{
			s2=s2+" "+sArray[i];
		}
		System.out.println(s2);
	}
}
