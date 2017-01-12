import java.util.*;
import java.util.Scanner;

class combo
{
	public static void main(String args[])
	{
		System.out.println("Without repetition: ");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				for(int k=1;k<=4;k++)
				{
					for(int l=1;l<=4;l++)
					{
						if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
						{

							System.out.print(i);
							System.out.print(j);
							System.out.print(k);
							System.out.print(l+" ");
						}
					}
				}
			}
		}
		System.out.println("\n\nWith repetition: ");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				for(int k=1;k<=4;k++)
				{
					for(int l=1;l<=4;l++)
					{
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.print(l+" ");
					}
				}
			}
		}
	}
}