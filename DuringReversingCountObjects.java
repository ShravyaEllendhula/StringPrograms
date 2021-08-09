package strings;

import java.util.Scanner;

public class DuringReversingCountObjects 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		String s3="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s3=s3+ch;
			count++;
		}
		System.out.println(count);
		 
	}
}
