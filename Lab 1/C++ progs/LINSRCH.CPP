#include<iostream.h>
#include<conio.h>

void main()
{
  clrscr();
  int x, i, n, a[20], flag=0;
  cout<<"\nEnter the size: ";
  cin>>n;
  cout<<"\nEnter data: \n";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the term to be searched: ";
  cin>>x;
  for(i=0;i<n;i++)
  {
    if(a[i]==x)
    {
      flag=1;
      cout<<"\nFound at pos: "<<i+1;
      break;
    }
  }
  if(flag==0)
    cout<<"\nNot found";
  getch();
}