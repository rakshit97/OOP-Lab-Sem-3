import java.util.*;

class Bank
{
	public void rate()
	{
		System.out.println("This displays rate of interests for different banks");
	}
}

class SBI extends Bank
{
	public void rate()
	{
		System.out.println("Rate of interest for SBI = 8%");
	}
}

class ICICI extends Bank
{
	public void rate()
	{
		System.out.println("Rate of interest for ICICI = 7%");
	}
}

class AXIS extends Bank
{
	public void rate()
	{
		System.out.println("Rate of interest for AXIS = 9%");
	}
}

class interest
{
	public static void main(String[] args)
	{
		Bank bnk = new Bank();
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		Bank ref;
		ref=bnk;
		ref.rate();
		ref=sbi;
		ref.rate();
		ref=icici;
		ref.rate();
		ref=axis;
		ref.rate();	
	}
}