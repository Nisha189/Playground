#include<iostream>
using namespace std;
int facto(int n){
  if(n==0)
    return 1;
  else
    return n*facto(n-1);}
int main()
{
  int a;
  std :: cin>>a;
  std :: cout<<"The factorial of "<<a<<" is "<<facto(a);//Type your code here.
}