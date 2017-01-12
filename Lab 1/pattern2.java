import java.util.*;
import java.util.Scanner;

class pattern2
{
	public static void main(String args[])
	{
		System.out.println("Enter no. of rows: ");
		int n,num=0;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
  		for(int i=0;i<n;i++)
  		{
     		for(int j=0;j<=i;j++)
     		{
       			num++;
       			System.out.print(num+" ");
     		}
     		System.out.println();
     	}
    }
}
     	