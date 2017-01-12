#include<iostream.h>
#include<conio.h>
#include<stdio.h>

void main()
{
  clrscr();
  char name[5][20], reg[5][10];
  int i, n, m1[5], m2[5], m3[5], avg[5];

  cout<<"Enter no. of students: ";
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<"\nEnter name of student "<<i<<": ";
    gets(name[i]);
    cout<<"\nEnter registration no. of student "<<i<<": ";
    gets(reg[i]);
    cout<<"\nEnter marks in subject 1: ";
    cin>>m1[i];
    cout<<"\nEnter marks in subject 2: ";
    cin>>m2[i];
    cout<<"\nEnter marks in subject 3: ";
    cin>>m3[i];
  }
  for(i=1;i<=n;i++)
  {
    cout<<"\nName of student: ";
    puts(name[i]);
    avg[i]=(m1[i]+m2[i]+m3[i])/3;
    cout<<"Average = "<<avg[i];
    cout<<"\nGrade = ";
    if(avg[i]>=91)
      cout<<"A+";
    else if(avg[i]>=81 && avg[i]<=90)
      cout<<"A";
    else if(avg[i]>=71 && avg[i]<=80)
      cout<<"B";
    else if(avg[i]>=61 && avg[i]<=70)
      cout<<"C";
    else if(avg[i]>=51 && avg[i]<=60)
      cout<<"D";
    else if(avg[i]>=41 && avg[i]<=50)
      cout<<"E";
    else
      cout<<"F";
  }
  getch();
}