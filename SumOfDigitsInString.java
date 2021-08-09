package strings;

import java.util.Scanner;

public class SumOfDigitsInString 
{
	public static void main(String[] args)
	{
		int count=0;
		int count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur String");
		String s1=sc.nextLine();
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				count=count+Character.getNumericValue(s1.charAt(i));//gives sum of digits
				//count1=count1+Character.getNumericValue(i);//checks how many digits present
				count1=count1+Character.getType(s1.charAt(i));
			}
			
		}
		System.out.println(count);
		System.out.println(count1);
		
	}
}
