package stringClass;
import java.util.Scanner;
public class Countdigits 
{
		public static void main(String[] args)
		{
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			String s1=sc.next();
			for(int i=0;i<s1.length();i++)
			{
				if(Character.isDigit(s1.charAt(i)))
				{
					count++;
				}
			}
			System.out.println("the total digits present in a gievn string is: "+count);
			 		 
		}
}


		 
