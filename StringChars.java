package strings;
import java.util.Scanner;

public class StringChars
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int num=s.length();
		System.out.println(num);
	}
}
