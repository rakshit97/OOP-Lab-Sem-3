import java.util.*;
import java.util.Scanner;

class symm
{
	public static void main(String args[])
	{
		int size;
		boolean flag=true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		size = input.nextInt();
		int a[][] = new int[size][size];
		System.out.println("Enter the data: ");
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				a[i][j] = input.nextInt();
		loop:for(int i=0;i<size;i++)
		{	for(int j=0;j<size;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					flag=false;
					System.out.println("Not symmetrical");
					break loop;
				}
			}
		}
		if(flag==true)	 
			System.out.println("Symmetrical");
	}
}