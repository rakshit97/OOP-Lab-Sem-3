import java.util.*;

class multi
{
	public static void main(String[] args)
	{
		int i, j, k, n1, m1, n2, m2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix 1:");
		n1=input.nextInt();
		m1=input.nextInt();
		int a[][]=new int[n1][m1];
		System.out.println("\nEnter rows and columns of matrix 2: ");
		n2=input.nextInt();
		m2=input.nextInt();
		int b[][]=new int[n1][m1];
		System.out.println("\nEnter data for matrix 1: \n");
		for(i=0;i<n1;i++)
			for(j=0;j<m1;j++)
				a[i][j]=input.nextInt();
		System.out.println("\nEnter data for matrix 2: \n");
		for(i=0;i<n2;i++)
			for(j=0;j<m2;j++)
				b[i][j]=input.nextInt();

	  int c[][]=new int[n1][m2];
	  if(m1==n2)
		{
			System.out.println("\nProduct of matrices: \n");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<m2;j++)
				{
		      for(k=0;k<m1;k++)
			      c[i][j]+=a[i][k]*b[k][j];
		      System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Cannot multiply");
	}
}

