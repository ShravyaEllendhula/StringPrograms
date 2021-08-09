package strings;

import java.util.Scanner;

public class ReverseStringAtSamePositions 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		String sArray[]=s1.split(" ");
		for(int i=sArray.length-1;i>=0;i--)
		{
			s2=s2+" "+sArray[i];
		}
		for(int j=s2.length()-1;j>=0;j--)
		{
			char ch=s2.charAt(j);
			s3=s3+ch;
		}
		System.out.println(s3);
	}
}
