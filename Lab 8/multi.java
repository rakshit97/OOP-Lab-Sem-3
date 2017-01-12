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


class multi
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		Thread1 t2 =new Thread1();

		t1.start();
		t2.start();
	}
}