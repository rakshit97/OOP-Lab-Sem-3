import java.util.*;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Extending Thread class");
		System.out.println("Finished");
	}

}


class demonstrate
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();

		t1.start();
		if(t1.isAlive())
			System.out.println("Thread 1 is alive, so joining with Thread 2.");
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.start();
	}
}