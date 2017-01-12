import java.util.*;

class Complex
{
	int r,img;
	public void getdata()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a complex number(real/imaginary): ");
		r=input.nextInt();
		img=input.nextInt();
	}
	public void add(int num, Complex c)
	{
		System.out.println("Sum = "+(num+c.r)+" + "+c.img+"i");
	}
	public void add(Complex c1, Complex c2)
	{
		System.out.println("Sum = "+(c1.r+c2.r)+" + "+(c1.img+c2.img)+"i");
	}
}
class cmp_sum
{
	public static void main(String args[])
	{
		System.out.println("Enter integer: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		Complex c1 = new Complex();
		c1.getdata();
		Complex c2 = new Complex();
		c2.getdata();
		Complex cmplx = new Complex();
		cmplx.add(num,c1);
		cmplx.add(c1,c2);
	}
}