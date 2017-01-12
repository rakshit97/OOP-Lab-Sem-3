#include<iostream.h>
#include<conio.h>

void main()
{
  clrscr();
  int a[10][10], n, i, j, sum=0;

  cout<<"Enter size of square matrix:" ;
  cin>>n;
  cout<<"\nEnter data for matrix: \n";
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];

  cout<<"\nTranspose of matrix: ";
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
      cout<<a[j][i]<<" ";
    cout<<"\n";
  }
  getch();
}
