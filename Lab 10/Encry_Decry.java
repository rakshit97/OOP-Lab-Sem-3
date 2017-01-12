import java.util.*;
import java.io.*;

class Encry_Decry
{
    public static void main(String[] args)
    {
        int k=16;
        
        try
        {
            FileReader fr = new FileReader("to_encrypt.txt");
            FileWriter fw = new FileWriter("encrypted.txt");

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
        
            while(br.ready())
            {
                char ch=(char)br.read();
                bw.write((char)(ch+k));
            }
        
            br.close();
            bw.close();
        
            br=new BufferedReader(new FileReader("encrypted.txt"));
            System.out.print('\n');
            while(br.ready())
                System.out.print((char)(br.read()-k));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
