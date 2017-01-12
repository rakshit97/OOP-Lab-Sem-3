import java.util.*;
import java.util.Scanner;

class leap
{
	public static void main(String args[])
	{
		int lp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an year");
		lp=input.nextInt();
		if(lp%4==0 && lp%100!=0)
			System.out.println("It is a leap year");
		else if (lp%400==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
	}
}