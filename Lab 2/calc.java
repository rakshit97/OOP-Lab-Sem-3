import java.util.*;
import java.util.Scanner;

class calc
{
	public static void main(String args[])
	{
		double a, b, multi, div, sum, diff;
		char choice, cont='y';
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		a=input.nextDouble();
		System.out.println("Enter number 2: ");
		b=input.nextDouble();
		while(cont=='y')
		{
			System.out.println("Enter operation to perform(+,-,*,/): ");
			choice=input.next().charAt(0);
			switch(choice)
			{
				case '+':	sum=a+b;
							System.out.println("Sum = "+sum);
							break;
				case '-':	diff=a-b;
							System.out.println("Difference = "+diff);
							break;
				case '*':	multi=a*b;
							System.out.println("Product = "+multi);
							break;
				case '/':	div=a/b;
							System.out.println("Quotient = "+div);
							break;
				default:	System.out.println("Enter valid operation!!!");
			}
			System.out.println("Perform another operation?(y/n): ");
			cont=input.next().charAt(0);
		}
	}
}