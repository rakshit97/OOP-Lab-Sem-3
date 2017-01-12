import java.util.*;
import java.io.*;

class Count {


    public static void main(String[] args)
    {
        int ca=0, cv=0, cl=0, cw=0;
        try
        {
        	FileReader fr = new FileReader("count.txt");
        	BufferedReader br = new BufferedReader(fr);
        	br.mark(100);
        	while(br.ready())
        	{
        	    ca++;
        	    char c=Character.toLowerCase((char)br.read());
        	    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        	        cv++;
        	}
        	br.reset();
        	String s;
        	while(br.ready())
        	{
        	    s=br.readLine();
        	    if(s.isEmpty()) break;
        	    for(int i=0; i<s.length(); i++)
        	        if(s.charAt(i)==' ')
        	        cw++;
        	    cl++;
        	}
        	br.close();
        	System.out.println("Number of characters : "+ca);
        	System.out.println("Number of vowels : "+cv);
        	System.out.println("Number of words : "+(cw+1));
        	System.out.println("Number of lines : "+(cl+1));
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
}