#include<iostream.h>
#include<conio.h>
#include<math.h>

void main()
{
  clrscr();
  int x, i, n, j, m=0;
  float sum=0, fact=1, term=0;
  cout<<"Enter the value of x: ";
  cin>>x;
  cout<<"\nEnter the no. of terms: ";
  cin>>n;
  m=0;
  for(i=1;i<(2*n)+1;i+=2)
  {
    for(j=1;j<=i;j++)
      fact*=j;
    term = pow(x,i)/fact;
    if(m%2==1)
      term*=-1;
    sum+=term;
    m++;
    term=0;
    fact=1;
  }
  cout<<"\nsin("<<x<<") = "<<sum;
  getch();
}