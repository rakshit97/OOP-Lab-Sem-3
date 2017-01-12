import java.util.*;

class Number
{
	double n;
	int num;
	public void getdata()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=input.nextDouble();
		num=(int)n;
	}
	public boolean isZero()
	{
		if(num==0)
			return true;
		return false;
	}
	public boolean isPositive()
	{
		if(num>0)
			return true;
		return false;
	}
	public boolean isNegative()
	{
		if(num<0)
			return true;
		return false;
	}
	public boolean isOdd()
	{
		if(num%2==1)
			return true;
		return false;
	}
	public boolean isEven()
	{
		if(num%2==0)
			return true;
		return false;
	}
	public boolean isPrime()
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public boolean isArmstrong()
	{
		int num1=num;
		int sum=0;
		while(num>0)
		{
			sum+=Math.pow((num%10),3);
			num/=10;
		}
		if(num1==sum)
			return true;
		return false;
	}
	public void display()
	{
		System.out.println("Number is zero: "+isZero());
		System.out.println("Number is positive: "+isPositive());
		System.out.println("Number is negative: "+isNegative());
		System.out.println("Number is odd: "+isOdd());
		System.out.println("Number is even: "+isEven());
		System.out.println("Number is prime: "+isPrime());
		System.out.println("Number is armstrong: "+isArmstrong());
	}
}

class check
{
	public static void main(String[] args)
	{
		Number e = new Number();
		e.getdata();
		e.display();
	}
}