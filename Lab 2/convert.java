import java.util.*;
import java.util.Scanner;

class convert
{
	public static void main(String args[])
	{
		int i;
		char c;
		double d;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		i=input.nextInt();
		System.out.println("Enter a character: ");
		c=input.next().charAt(0);
		System.out.println("Enter a double value: ");
		d=input.nextDouble();
		byte b = (byte)i;
		int i1 = (char)c;
		int b1 = (byte)d;
		int i2 = (int)d;
		System.out.println("Converted = "+b+" "+i1+" "+b1+" "+i1);
	}
}