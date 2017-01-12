import java.util.*;
import java.util.Scanner;

class sum
{
  public static void main(String args[])
  {
    int i, n, j;
    double sum=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the no.of terms: ");
    n=input.nextInt();
  
    for(i=1;i<=n;i++)
    {
      double term = 1/(double)i;
      sum+=Math.pow(term,i);
    }
    System.out.println("sum = "+sum);
  }
}