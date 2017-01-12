import java.util.*;
import java.io.*;

class general
{
	public static void main(String[] args)
	{
		int opt;
		char cont='y';
		while(cont=='y')
		{
			System.out.print("1.Write\n2.Read\n3.Copy to another file\n4.Exit\n\nYour choice: ");
			Scanner sc=new Scanner(System.in);
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:	System.out.println("Enter string to write: ");
						    String str=sc.next();
						    try
						    {  
   							  FileWriter fw = new FileWriter("abc.txt");  
   							  fw.write(str);  
   							  fw.close();  
  						  }
  						  catch(Exception e)
  						  {
  							 System.out.println(e);
  						  }  
  						  System.out.println("\nFile written successfully!");
  						  break;

  			case 2:	try
  						  {
 							   FileReader fr = new FileReader("abc.txt");
 							   int b;
 							   while((b=fr.read())!=-1)
 								  System.out.print((char)b);
 							   fr.close();
 						    }
 						    catch(Exception e)
 						    {
 							   System.out.println(e);
 						    }
 						    break;

 				case 3:	try
 						    {
 							   FileReader fr1 = new FileReader("abc.txt");
 							   String str1="";
 							   int b1;
  						
 							   while((b1=fr1.read())!=-1)
 								  str1+=(char)b1;
 							   fr1.close();
 							   FileWriter fw1 = new FileWriter("abc_copy.txt");
 							   fw1.write(str1);
 							   fw1.close();
 						    }
 						    catch(Exception e)
 						    {
 							   System.out.println(e);
 						    }
 						    System.out.println("File copied successfully!");
 						    break;
 				case 4:  System.exit(0);
			}
			System.out.print("\n\nContinue?(y/n): ");
			cont=sc.next().charAt(0);
		}
	}
}