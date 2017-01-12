import java.util.*;
import java.util.Scanner;

class pattern
{
	public static void main(String args[])
	{
		System.out.println("Enter no. of rows: ");
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}