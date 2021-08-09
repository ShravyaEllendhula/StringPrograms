package stringClass;

public class LengthNdCharAt
{
	public static void main(String[]args)
	{
		//length():int
		String s1="html";
		int i=s1.length();
		System.out.println(i);
		
		//charAt(int index)                                                                                                                                                                                                                                                                                       ):char
		String s2="developer";
		char ch=s2.charAt(6);
		System.out.println(ch);
		
		//indexOf(char ch):int
		//indexOf(char ch,int fromIndex):int
		String s3="JavaDeveloper";
		int i1=s3.indexOf('a');//it will returns index of given character
		System.out.println(i1);
		int i2=s3.indexOf('y');//if index of given character in not available it returns -1
		System.out.println(i2);
		int i3=s3.indexOf('e',8);//for nth occurrence previous elements index plus 1
		System.out.println(i3);
		
		//toCharArray():char[]
		String s4="html";
		char[] ch1 =s4.toCharArray();
		for(int k=0;k<=ch1.length-1;k++)
		{
			System.out.println(ch1[k]);
		}
		
	}
}
