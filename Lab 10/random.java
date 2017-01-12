import java.util.*;
import java.io.*;

class random
{
	public static void main(String[] args)
	{
		int opt;
		char cont='y';
		while(cont=='y')
		{
			System.out.print("1.Write\n2.Read\n3.Append\n4.Exit\n\nYour choice: ");
			Scanner sc=new Scanner(System.in);
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:	System.out.println("Enter string to write: ");
						String str=sc.next();
						try
						{
   							RandomAccessFile fw = new RandomAccessFile("abc.txt", "rw");
   							fw.seek(0);
   							fw.writeUTF(str);
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
  							byte[] b = new byte[100];
  							File f = new File("abc.txt");
  							long len = f.length();
  							RandomAccessFile fr = new RandomAccessFile(f, "rw");
  							fr.seek(0);
  							fr.readFully(b, 0, (int)len);
  							fr.close();
  							String str1 = new String(b, "UTF-8");
  							System.out.println(str1);
  						}
  						catch(Exception e)
  						{
  							System.out.println(e);
  						}
  						break;

  				case 3:	System.out.println("Enter string to append: ");
						String str2=sc.next();
  						try
  						{
  							File f = new File("abc.txt");
  							long length = f.length();
  							RandomAccessFile fw1 = new RandomAccessFile(f, "rw");
  							fw1.seek(length);
  							fw1.writeUTF(str2);
  							fw1.close();
  						}
  						catch(Exception e)
  						{
  							System.out.println(e);
  						}
  						System.out.println("File edited successfully!");
  						break;

  				case 4:  System.exit(0);
			}
			System.out.print("\n\nContinue?(y/n): ");
			cont=sc.next().charAt(0);
		}
	}
}