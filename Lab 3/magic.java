import java.util.*;
import java.util.Scanner;

class magic
{
	public static void main(String args[])
	{
		int size, sum=0, sum1=0,c=0,i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		size = input.nextInt();
		int a[][] = new int[size][size];
		int s[]=new int[8];
		System.out.println("Enter the data: ");
		for(i=0;i<size;i++)
			for(j=0;j<size;j++)
				a[i][j] = input.nextInt();
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				sum+=a[i][j];
				sum1+=a[j][i];
			}
			s[c++]=sum;
			s[c++]=sum1;
			sum1=sum=0;
		}	
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i==j)
					sum+=a[i][j];
				if(i+j==size-1)
					sum1+=a[i][j];
			}
		}
		s[c++]=sum;
		s[c++]=sum1;
		int flag=0;
		for(i=0;i<8;i++)
		{
			if(s[i]!=s[0])
			{
				System.out.println("Not a magic square");
				flag=1;
				break;
			}
		}
		if(flag==0)	
			System.out.println("It is a magic square");	
	}
}