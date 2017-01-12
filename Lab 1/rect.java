import java.util.*;
import java.util.Scanner;

class rect
{
	public static void main(String args[])
	{
		System.out.println("Enter length: ");
		int l,b;
		Scanner input = new Scanner(System.in);
		l=input.nextInt();
		System.out.println("Enter breadth: ");
		b=input.nextInt();
		double area = l*b;
		double cir = 2*(l+b);
		System.out.println("Area = "+area+" and circumference = "+cir);
	}
}