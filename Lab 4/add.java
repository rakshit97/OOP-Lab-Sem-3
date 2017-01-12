import java.util.*;

class Time
{
	int hh, mm, ss;
	Time()
	{
		hh=mm=ss=0;
	}
	Time(int h, int m, int s)
	{
		hh=h;
		mm=m;
		ss=s;
	}
	public void getdata()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hours: ");
		hh = input.nextInt();
		System.out.println("Enter minutes: ");
		mm = input.nextInt();
		System.out.println("Enter seconds: ");
		ss = input.nextInt();
	}
	public void calculate(Time t1, Time t2)
	{
		this.ss=t1.ss+t2.ss;
		if(this.ss>=60)
		{
			this.ss-=60;
			this.mm++;
		}
		this.mm+=t1.mm+t2.mm;
		if(this.mm>=60)
		{
			this.mm-=60;
			this.hh++;
		}
		this.hh+=t1.hh+t2.hh;
	}
	public void display()
	{
		System.out.println("Time: "+this.hh+"/"+this.mm+"/"+this.ss);
	}
}

class add
{
	public static void main(String[] args)
	{
		Time t1=new Time(11,12,24);
		Time t2=new Time(1,24,12);
		Time t=new Time();
		t.calculate(t1,t2);
		t.display();
	}
}