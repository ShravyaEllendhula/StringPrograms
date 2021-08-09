package strings;

public class Builder1 
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("hai");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.insert(2, "haii");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(2,5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
		sb.replace(1, 2, "hi");
		System.out.println(sb);
		
	}
}
