import java.util.*;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Using Runnable interface");
	}
}


class setandcheck
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1);
		try
		{
			t1.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}