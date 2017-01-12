#include<iostream.h>
#include<conio.h>

void main()
{
  clrscr();
  int i, num=0, j, n;
  cout<<"Enter no. of rows: ";
  cin>>n;
  for(i=0;i<n;i++)
  {
     for(j=0;j<=i;j++)
     {
       num++;
       cout<<num<<" ";
     }
     cout<<"\n";
  }
  getch();
}