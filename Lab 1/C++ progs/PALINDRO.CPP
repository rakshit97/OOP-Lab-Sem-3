#include<iostream.h>
#include<conio.h>
#include<stdio.h>
#include<string.h>

void main()
{
  clrscr();
  char str[20], str_rev[20];
  int l,i;

  cout<<"Enter a string: ";
  gets(str);
  l=strlen(str);
  for(i=0;i<l;i++)
    str_rev[i]=str[l-i-1];
  str_rev[l]='\0';
  if(strcmpi(str,str_rev)==0)
    cout<<"\nIt is a palindrome";
  else
    cout<<"\nNot a palindrome";

  getch();
}