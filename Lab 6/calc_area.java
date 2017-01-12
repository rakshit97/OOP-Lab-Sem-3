import java.util.*;

abstract class Area
{
	double area;
	public void calc(double r)
	{
		area=3.14*r*r;
		System.out.println("Area of circle = "+area);
	}
	public void calc(double l, double b)
	{
		area=l*b;
		System.out.println("Area of rectangle = "+area);
	}
}

class Circle extends Area
{
	Scanner sc = new Scanner(System.in);
	double r;
	public void getdata()
	{
		System.out.println("Enter radius: ");
		r=sc.nextDouble();
		calc(r);
	}
}
class Rectangle extends Area
{
	Scanner sc = new Scanner(System.in);
	double l,b;
	public void getdata()
	{
		System.out.println("Enter length: ");
		l=sc.nextDouble();
		System.out.println("Enter breadth: ");
		b=sc.nextDouble();
		calc(l,b);
	}
}
class calc_area
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		rect.getdata();
		cir.getdata();
	}
}