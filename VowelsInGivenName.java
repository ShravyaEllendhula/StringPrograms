package stringClass;

import java.util.Scanner;

public class VowelsInGivenName 
{
	public static void main(String[] args)
	{
		 int countV=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a String");
		 String s=sc.nextLine();
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			 {
				 countV++;	 
			 }
		 }
		 System.out.println("the no of vowels is:"+countV);
		 
	}
}
