import java.util.*;

class Employee
{
	String name, city;
	int salary;
	double da, hra, total;
	public void getdata()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = input.next();
		System.out.println("Enter city: ");
		city = input.next();
		System.out.println("Enter basic salary: ");
		salary = input.nextInt();
		System.out.println("Enter dearness allowance(%): ");
		da = input.nextDouble();
		System.out.println("Enter house rent allowance(%): ");
		hra = input.nextDouble();
	}
	public double calculate()
	{
		total = salary+(salary*(da/100))+(salary*(hra/100));
		return total;
	}
	public void display()
	{
		System.out.println("Total salary = "+calculate());
	}
}

class emp
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.getdata();
		e.display();
	}
}