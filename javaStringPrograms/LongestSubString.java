package javaStringPrograms;

import java.util.Scanner;

public class LongestSubString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Sentence");
		String s1=sc.nextLine();
		String[] sArr = s1.split(" ");
		int big= sArr[0].length();
		int index=0;
		for(int i=0;i<=sArr.length-1;i++)
		{
			int tempbig=sArr[i].length();
			if(tempbig>big)
			{
				big=tempbig;
				index=i;
			}
		}
		System.out.println(sArr[index]);
	}
	 
}
