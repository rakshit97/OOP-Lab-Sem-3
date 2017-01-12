import java.util.*;

class CustomException extends Exception
{
	String msg;
	CustomException(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}

class Random
{
	Scanner sc = new Scanner(System.in);
	public void check_2d() throws CustomException
	{
		int m,n;
		System.out.println("Enter rows: ");
		m=sc.nextInt();
		System.out.println("Enter columns: ");
		n=sc.nextInt();
		if(m!=n)
			throw new CustomException("Not a square matrix!!!");
		else
			System.out.println("Square matrix");
	}
	public void neg_root() throws CustomException
	{
		int x;
		System.out.println("Enter any number: ");
		x=sc.nextInt();
		if(x<0)
			throw new CustomException("Negative number!!!");
		else
			System.out.println("Root = "+Math.sqrt(x));
	}
}

class custom
{
	public static void main(String[] args)
	{
		Random r=new Random();
		try
		{
			r.check_2d();
		}
		catch(CustomException e)
		{
			System.out.println("Not a square matrix!!!");
		}
		try
		{
			r.neg_root();
		}
		catch(CustomException e)
		{
			System.out.println("Cannot find square of negative numbers!!!");
		}
	}
}