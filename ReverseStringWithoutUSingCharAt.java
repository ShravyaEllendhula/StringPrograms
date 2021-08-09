package strings;

import java.util.Scanner;

public class ReverseStringWithoutUSingCharAt 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch[]=s1.toCharArray();
			s2=s2+ch[i];
		}
		System.out.println(s2);
	
	}
}
