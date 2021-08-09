package stringClass;

public class LongestString 
{
	public static void main(String[] args) 
	{
		String s1="hai howareyou hopeyouaredoinggoodd";
		String s2=longestEvenString(s1);
		System.out.println(s2);
		
	}
	public static String longestEvenString(String s1)
	{
		String [] s2=s1.split(" ");
		String longest =s2[0];
		for(String str:s2)
		{
			if(s1.length()>longest.length())
			{
				if(str.length()%2==0)
				{
			      longest=str;
				}
			}
		}
		return longest;
	}
	
}
