#include<iostream>
using namespace std;
int main()
{
  int a,temp,sum=0;
  std :: cin>>a;
  temp=a;
  while(a>0){
    sum=sum+(a%10);a=a/10;}
  if(temp%sum==0)
    std :: cout<<"Harshad Number";
  else
    std :: cout<<"Not Harshad Number";//Type your code here.
}