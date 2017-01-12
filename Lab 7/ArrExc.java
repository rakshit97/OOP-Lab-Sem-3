import java.util.*;

class ArrExc
{
	public static void main(String[] args)
	{
		int[] x=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index: ");
		i=sc.nextInt();
		try
		{
			System.out.println(x[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cannot access the required index!!!");
		}
	}
}