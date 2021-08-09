package strings;
import java.util.Scanner;

public class VowelsNDConso
{
	public static void main(String[] args)
	{
		 int countV=0;
		 int countC=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a String");
		 String s=sc.nextLine();
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			 {
				 countV++;	 
			 }
			 else
			 {
				 countC++;	 
			 }
		 }
		 System.out.println("the no of vowels is:"+countV);
		 System.out.println("the no of conconents is:"+countC);
	}
}
