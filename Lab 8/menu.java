import java.util.*;

class Thread1 implements Runnable
{
	private Thread t;
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Using Runnable interface");
	}
	public void start()
	{
		t = new Thread(this, "Thread1");
		t.start();
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Extending Thread class");
	}
}

class menu
{
	public static void main(String[] args)
	{
		System.out.println("1. Use Runnable interface\n2.Extend Thread class\n\nYour choice: ");
		int opt;
		Scanner sc = new Scanner(System.in);
		opt=sc.nextInt();
		if(opt==1)
		{
			Thread1 t1 = new Thread1();
			t1.start();
		}
		if(opt==2)
		{
			Thread2 t2 =new Thread2();
			t2.start();
		}
	}
}