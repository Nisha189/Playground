#include<iostream>
using namespace std;
int main()
{
  int n,add=5,s=6;
  std :: cin>>n;
  while(n!=0){
    std :: cout<<s<<" ";
    s=s+add;
    add+=5;
    n--;
  }
}