import java.util.*;
import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		int flag=0;
		System.out.println("Enter lower bound: ");
		int l,u;
		Scanner input = new Scanner(System.in);
		l=input.nextInt();
		System.out.println("Enter upper bound: ");
		u=input.nextInt();
		for(int i=l;i<=u;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i+" ");
		}
	}
}