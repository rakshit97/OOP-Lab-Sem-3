#include<iostream.h>
#include<conio.h>

void main()
{
  clrscr();
  int a[10][10], b[10][10], n1, m1, n2, m2, i, j, c[10][10];

  cout<<"Enter rows and columns of matrix 1:" ;
  cin>>n1>>m1;
  cout<<"\nEnter rows and columns of matrix 2: ";
  cin>>n2>>m2;
  cout<<"\nEnter data for matrix 1: \n";
  for(i=0;i<n1;i++)
    for(j=0;j<m1;j++)
      cin>>a[i][j];
  cout<<"\nEnter data for matrix 2: \n";
  for(i=0;i<n2;i++)
    for(j=0;j<m2;j++)
      cin>>b[i][j];

  if(n1==n2 && m1==m2)
  {
    cout<<"\nSum of matrices is: \n";
    for(i=0;i<n1;i++)
    {
      for(j=0;j<m1;j++)
      {
	c[i][j]=a[i][j]+b[i][j];
	cout<<c[i][j]<<" ";
      }
      cout<<"\n";
    }
  }
  else
    cout<<"\nCannot add";

  if(m1==n2)
  {
    cout<<"\nProduct of matrices: \n";
    for(i=0;i<n1;i++)
    {
      for(j=0;j<m2;j++)
      {
	for(int k=0;k<m1;k++)
	  c[i][j]+=a[i][k]*b[k][j];
	cout<<c[i][j]<<" ";
      }
      cout<<"\n";
    }
  }
  else
    cout<<"Cannot multiply";

  getch();
}