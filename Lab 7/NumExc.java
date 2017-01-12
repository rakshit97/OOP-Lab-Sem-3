import java.util.*;

class NumExc
{
	public static void main(String[] args)
	{
		String s;
		int x;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		try
		{
			x=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Cannot convert to integer!!!");
		}
	}
}