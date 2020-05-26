#include<iostream>
using namespace std;
void collatz(int n,int cnt)
  {
    if(n==1){
      std :: cout<<n<<"\n";
      std :: cout<<cnt;}
    else{
      std :: cout<<n<<"\n";
      int temp;
      temp=n%2==0?(n/2):(3*n+1);cnt+=1;
      collatz(temp,cnt);}}
  int main(){
    int a;
    std :: cin>>a;
    collatz(a,0);}//Type your code here.