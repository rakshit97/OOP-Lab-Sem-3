#include<iostream.h>
#include<conio.h>

void main()
{
  clrscr();
  int i, n, a[20];
  cout<<"\nEnter the size: ";
  cin>>n;
  cout<<"\nEnter data: \n";
  for(i=0;i<n;i++)
    cin>>a[i];

  for(i=0;i<n;i++)
  {
    for(int j=0;j<n-i;j++)
    {
      if(a[j]>a[j+1])
      {
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
    cout<<a[i]<<" ";
  getch();
}