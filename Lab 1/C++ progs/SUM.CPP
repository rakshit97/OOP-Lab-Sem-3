#include<iostream.h>
#include<conio.h>
#include<math.h>

void main()
{
  clrscr();
  int i, n;
  float sum=0;
  cout<<"Enter no. of terms: ";
  cin>>n;
  for(i=1;i<=n;i++)
  {
    float term = 1/(float)i;
    sum+=pow(term,i);
  }
  cout<<"\nSum = "<<sum;
  getch();
}