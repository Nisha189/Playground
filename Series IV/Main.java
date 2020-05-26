#include<iostream>
using namespace std;
int main()
{
  int add=6,s=2,c,temp=0;
  std :: cin>>c;
  std :: cout<<0<<" ";
  while(c-1!=0){
    std :: cout<<s<<" ";
    s+=add;
    temp+=1;
    if(temp==2){
      temp=0;add+=4;}
    c--;}//Type your code here.
}