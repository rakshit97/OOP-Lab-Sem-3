import java.util.*;

class Box
{
	double w, h, d;
	public void init(double w, double h, double d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public double vol()
	{
		return (w*h*d);
	}
}

class volume
{
	public static void main(String[] args)
	{
		double width, height, depth;
		Box b = new Box();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter width: ");
		width = input.nextDouble();
		System.out.println("Enter height: ");
		height = input.nextDouble();
		System.out.println("Enter depth: ");
		depth = input.nextDouble();
		b.init(width, height, depth);
		System.out.println("Volume = "+b.vol());
	}
}