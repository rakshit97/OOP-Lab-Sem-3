#include<iostream.h>
#include<conio.h>
#include<stdio.h>
#include<string.h>

void main()
{
  clrscr();
  char str[50];
  int j, l, a=0, e=0, i=0, o=0, u=0, dig=0;

  cout<<"Enter string: ";
  gets(str);
  l=strlen(str);
  for(j=0;j<l;j++)
  {
    if(str[j]=='a' || str[j]=='A')
      a++;
    if(str[j]=='e' || str[j]=='I')
      e++;
    if(str[j]=='i' || str[j]=='I')
      i++;
    if(str[j]=='o' || str[j]=='O')
      o++;
    if(str[j]=='u' || str[j]=='U')
      u++;
    if(str[j]=='1' || str[j]=='2' || str[j]=='3' || str[j]=='4' || str[j]=='5' || str[j]=='6' || str[j]=='7' || str[j]=='8' || str[j]=='9' || str[j]=='0')
      dig++;
  }
  cout<<"\nNo. of 'a' = "<<a;
  cout<<"\nNo. of 'e' = "<<e;
  cout<<"\nNo. of 'i' = "<<i;
  cout<<"\nNo. of 'o' = "<<o;
  cout<<"\nNo. of 'u' = "<<u;
  cout<<"\nNo. of digits = "<<dig;
  getch();
}