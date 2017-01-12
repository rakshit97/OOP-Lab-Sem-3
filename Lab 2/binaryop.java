import java.util.*;
import java.util.Scanner;

class binaryop
{
	public static void main(String args[])
	{
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		num=input.nextInt();
		int multi = num<<1;
		int div = num>>1;
		System.out.println("Multiplication = "+multi+" and division = "+div);
	}
}