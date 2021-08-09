package javaStringPrograms;

import java.util.Scanner;

public class EachOccurenceOfWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Sentece");
		String s1=sc.nextLine();
		String[] sArr=s1.split(" \\s+");
		String s2=sArr[0];
		 for(int i=1;i<=sArr.length-1;i++)
		 {
			 String ts=sArr[i];
			 if(!s2.contains(ts))
			 {
				 s2=s2+" "+ts;
			 } 
		 }
		 String[] sArr2=s2.split(" ");
		 for(int x=0;x<=sArr2.length-1;x++)
		 {
			 int count=0;
			 for(int y=0;y<=sArr2.length-1;y++)
			 {
				 String ts1=sArr2[x];
				 String ts2=sArr2[y];
				 if(ts1.equals(ts2))
				 {
					 count++;
				 }
			 }
			 System.out.println(sArr2[x]+ ":"+count);
		 }
	}
}
