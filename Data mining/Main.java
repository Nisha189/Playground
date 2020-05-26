#include<iostream>
using namespace std;
int main()
{
  int a;
  std :: cin>>a;
  int o=0,e=0;
  while(a>0){
    int temp=a%10;
    temp%2==0?e+=temp:o+=temp;
    a=a/10;
  }
  if(o==e)
    std :: cout<<"Yes";
  else
    std :: cout<<"No";//Type your code here.
}