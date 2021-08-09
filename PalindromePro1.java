package stringClass;

import java.util.Scanner;

public class PalindromePro1 
{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter ur String");
		 String s=sc.nextLine();
		 if(Palindrome1(s))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
	}
	public static boolean Palindrome1(String s1)
	{
		 if(s1.length()==1)
		 {
			 return true;
		 }
		 if(s1.charAt(0)==s1.charAt(s1.length()-1))
		 {
			 return Palindrome1(s1.substring(1,s1.length()-1));
		 }
		 return false;
	}
}