import java.util.*;

class Student
{
	int[] m= new int[3];
	String name;
	int roll_no;
	double per;
	char grade;
	public void getdata() throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter roll_no: ");
		roll_no=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter marks for subject "+i+" : ");
			m[i]=sc.nextInt();
			if(m[i]<=0 || m[i]>=100)
				 throw new NumberFormatException("marks problem");
		}
	}
	public void putdata()
	{
		per=(m[0]+m[1]+m[2])/3;
		if(per>=90)
			grade='A';
		if(per>=80 && per<90)
			grade='B';
		if(per>=70 && per<80)
			grade='C';
		if(per>=60 && per<70)
			grade='D';
		if(per>=50 && per<60)
			grade='E';
		if(per<50)
			grade='F';
		System.out.println("Percentage = "+per+"%\nGrade = "+grade);
	}
}

class stud
{
	public static void main(String[] args)
	{
		Student s=new Student();
		try
		{
			s.getdata();
			s.putdata();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Marks should be between 0 and 100!!!");
		}
	}
}