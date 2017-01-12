import java.util.*;
import java.util.Scanner;

class sine
{
  public static void main(String args[])
  {
    int x, i, n, j, m=0;
    double sum=0, fact=1, term=0;
    System.out.println("Enter the value of x: ");
    Scanner input = new Scanner(System.in);
    x=input.nextInt();
    System.out.println("Enter the no.of terms: ");
    n=input.nextInt();
  
    m=0;
    for(i=1;i<(2*n)+1;i+=2)
    {
      for(j=1;j<=i;j++)
        fact*=j;
      term = Math.pow(x,i)/fact;
      if(m%2==1)
        term*=-1;
      sum+=term;
      m++;
      term=0;
      fact=1;
    }
    System.out.println("sin(x) = "+sum);
  }
}