import java.util.*;

class Str
{
	boolean palindrome(String s)
	{
		String rev = new StringBuilder(s).reverse().toString();
		if(s.compareToIgnoreCase(rev)==0)
			return true;
		else
			return false;
	}
	String order(String s)
	{
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length()-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		s = new String(arr);
		return s;
	}
	String rev(String s)
	{
		String r = new StringBuilder(s).reverse().toString();
		return r;
	}
	String cnct(String s)
	{
		String r = new StringBuilder(s).reverse().toString();
		s = s.concat(r);
		return s;
	}
}

class menu1
{
	public static void main(String[] args)
	{
		Str str = new Str();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("Enter the string");
		String s = sc.nextLine();
		while(choice!=5)
		{
			System.out.println("1.Check if palindrome\n2.Sort alphabetically\n3.Reverse\n4.Concatenate\n5.Exit");
			choice = sc.nextInt();
			if(choice==1)
				System.out.println(str.palindrome(s));
			if(choice==2)
				System.out.println(str.order(s));
			if(choice==3)
				System.out.println(str.rev(s));
			if(choice==4)
				System.out.println(str.cnct(s));
		}
	}
}