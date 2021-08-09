package strings;
import java.util.Scanner;

public class SearchChars 
{
	public static void main(String[] args)
	{
		int count=0;
		int count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		System.out.println("enter a charecter");
		char ch=sc.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(s1.indexOf(ch)))
			{
				 count++;
			}
			else
			{
				count1++;  
			}
		}
		System.out.println("the given char is present"+count);
		System.out.println("the given char is not present"+count1);
	}
}
