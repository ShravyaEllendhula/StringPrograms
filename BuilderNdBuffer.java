package strings;

public class BuilderNdBuffer 
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hai");
		System.out.println(sb);
		sb.insert(1,"mrng");
		System.out.println(sb);
		sb.replace(1,3,"@");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(30);
		System.out.println(sb.capacity());
	}
}
