#include<iostream>
using namespace std;
int main(){
  int n,i=1;
  std :: cin>>n;
  for(;i<=4;i++){
    for(int j=1;j<=i;j++){
      std :: cout<<n;}
    std :: cout<<"\n";n++;
  }
  i--;n--;
  for(;i>=1;i--){
    for(int j=1;j<=i;j++)
      std :: cout<<n;
    std :: cout<<"\n";
    n--;
  }
}