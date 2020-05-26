#include<iostream>
#include<cmath>
using namespace std;
int noofdgts(int a){
  int ans=0;
  while(a>0){
    ans++;
    a=a/10;
  }
  return ans;
}
int rvrse(int a){
  int ans=0;
  while(a>0){
    ans=ans*10+(a%10);
    a=a/10;
  }
  return ans;
}
int main()
{
  int a;
  std :: cin>>a;
  int sq=a*a,n=noofdgts(a);
  int l=0,r=0;
  l=sq/(pow(10,n));
  r=rvrse(rvrse(sq)/pow(10,n));
  if(r+l==a)
    std :: cout<<"Kaprekar Number";
  else
    std :: cout<<"Not a Kaprekar Number";
}