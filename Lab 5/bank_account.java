import java.util.*;

class Account
{
	String name;
	long acc_no;
	boolean type;
	double balance;
	Account()
	{	}

	Scanner input = new Scanner(System.in);

	public void getdata()
	{
		System.out.println("Enter name: ");
		name=input.next();
		System.out.println("Enter account no: ");
		acc_no=input.nextLong();
		System.out.println("Enter type of bank account:(1. Savings\t2.Current) ");
		int typ=input.nextInt();
		if(typ==1)
			type=true;
		if(typ==2)
			type=false;
	}
	public void display()
	{
		System.out.println("Current balance: " + balance);
	}
	public void deposit()
	{
		System.out.println("Enter amount to be deposited: ");
		int deposit=input.nextInt();
		balance+=deposit;
		System.out.println("Current balance: " + balance);
	}
	public void withdraw()
	{
		System.out.println("Enter amount to be withdrawn: ");
		int withdraw=input.nextInt();
		if(balance-withdraw>0)
		{
			balance-=withdraw;
			System.out.println("Current balance: " + balance);
		}
		else
			System.out.println("NOT ENOUGH BALANCE!!!");
	}
}

class Savings extends Account
{
	Savings()
	{
		super();
	}
	double interest;
	public void interest()
	{
		interest=(5*balance)/100;
		balance+=interest;
		System.out.println("Interest = " + interest + "\nCurrent balance: " + balance);
	}
}

class Current extends Account
{
	Current()
	{
		super();
	}
	int penalty=1000;
	public void check()
	{
		if(balance<20000)
		{
			System.out.println("LOW BALANCE!!!");
			balance-=penalty;
			System.out.println("Current balance: " + balance);
		}
	}
}

class bank_account
{
	public static void main(String[] args)
	{
		int choice;
		char cont='y';
		Scanner input = new Scanner(System.in);
		Savings sv = new Savings();
		Current cr = new Current();
		Account acc = new Account();
		acc.getdata();
		while(cont=='y')
		{
			System.out.println("1.Display balance\n2.Deposit\n3.Withdraw\n4.Check Interest\n5.Check Minimum Balance\n\nYour choice: ");
			choice = input.nextInt();
			switch(choice)
			{
				case 1:	sv.display();break;
				case 2:	sv.deposit();break;
				case 3:	sv.withdraw();break;
				case 4: if(acc.type==true)
							sv.interest();
						else
							System.out.println("No interest for Current accountholders");
						break;
				case 5: if(acc.type==false)
							cr.check();
						else
							System.out.println("No minimum balance for savings accountholders");
						break;
			}
			System.out.println("Continue?(y/n): ");
			cont=input.next().charAt(0);
		}
	}
}