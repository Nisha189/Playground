#include<iostream>
int main()
{
 int a,b;
  std :: cin>>a>>b;
  int ans=a<b?a:b;
  for(int i=ans;i>0;i--){
    if(a%i==0 && b%i==0){
      ans=i;break;}
  }
  std :: cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<ans;//Type your code here.
}