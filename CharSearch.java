package strings;
import java.util.Scanner;
public class CharSearch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.next();
		System.out.println("enter a charecter");
		String ch=sc.next();
		if(s.contains(ch))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		 
		
	}
}
