import java.util.*;

interface Input
{
	public void getdata();
	public void calc(int price);
}

class Hardware implements Input
{
	String category, manufacturer;
	int price,total;
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category: ");
		category=sc.next();
		System.out.println("Enter manufacturer: ");
		manufacturer=sc.next();
		System.out.println("Enter price: ");
		price=sc.nextInt();
		calc(price);
	}
	public void calc(int price)
	{
		total+=price;
		System.out.println("Total sales = "+total);
	}
}
class Software implements Input
{
	String company,os;
	int price,total;
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company: ");
		company=sc.next();
		System.out.println("Enter OS: ");
		os=sc.next();
		System.out.println("Enter price: ");
		price=sc.nextInt();
		calc(price);
	}
	public void calc(int price)
	{
		total+=price;
		System.out.println("Total sales = "+total);
	}
}

class sales
{
	public static void main(String[] args)
	{
		Hardware h = new Hardware();
		Software s = new Software();
		h.getdata();
		s.getdata();
	}
}