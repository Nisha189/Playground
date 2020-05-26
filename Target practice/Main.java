#include<iostream>
using namespace std;
int main()
{
  int n,temp=0,hit,cn=0;
  std :: cin>>n;
  while(temp<n){
    std :: cin>>hit;
    temp+=hit;
    cn+=1;
  }
  std :: cout<<"The number of turns is "<<cn;//Type your code here.
}