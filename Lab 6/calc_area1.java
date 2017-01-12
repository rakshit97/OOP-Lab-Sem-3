import java.util.*;

interface Area
{
	public void calc();
}

class Circle implements Area
{
	Scanner sc = new Scanner(System.in);
	double r;
	public void getdata()
	{
		System.out.println("Enter radius: ");
		r=sc.nextDouble();
		calc();
	}
	public void calc()
	{
		double area=3.14*r*r;
		System.out.println("Area of circle = "+area);
	}
}
class Rectangle implements Area
{
	Scanner sc = new Scanner(System.in);
	double l,b;
	public void getdata()
	{
		System.out.println("Enter length: ");
		l=sc.nextDouble();
		System.out.println("Enter breadth: ");
		b=sc.nextDouble();
		calc();
	}
	public void calc()
	{
		double area=l*b;
		System.out.println("Area of rectangle = "+area);
	}
}
class calc_area1
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		rect.getdata();
		cir.getdata();
	}
}