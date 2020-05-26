#include<iostream>
using namespace std;
void swap(int &a,int &b)
{
  a=a+b;
  b=a-b;
  a=a-b;
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
}
