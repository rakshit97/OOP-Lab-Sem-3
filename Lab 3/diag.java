import java.util.*;
import java.util.Scanner;

class diag
{
	public static void main(String args[])
	{
		int size, sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		size = input.nextInt();
		int a[][] = new int[size][size];
		System.out.println("Enter the data: ");
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				a[i][j] = input.nextInt();
		System.out.println("The principal diagonal elements are: ");
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				if(i==j)
				{
					sum+=a[i][j];
					System.out.print(a[i][j] + " ");
				}
		System.out.println("Sum of principal diagonal elements = " + sum);	
	}
}