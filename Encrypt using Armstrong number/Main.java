#include<iostream>
#include<cmath>
int power(int c,int d)
{
 int pow=1;
  int i=1;
  while(i<=d){
    pow=pow*c;
    i++;}
  return pow;
}
int main()
{
  int num; 
  int f,rem,sum=0,temp,a=0;
  std :: cin>>num;
  temp=num;
  while(temp!=0){
    temp=temp/10;
    a=a+1;}
  f=num;
  while(f!=0){
    rem=f%10;
    sum=sum+pow(rem,a);
    f=f/10;
  }
    if(sum==num)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}