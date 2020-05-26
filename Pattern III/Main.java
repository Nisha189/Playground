#include<iostream>
using namespace std;
int main(){
  int n,i=1;
  cin>>n;
  for(;i<=n;i++){
    for(int j=1;j<=i;j++){
      if(j==i)
        cout<<i;
      else
        cout<<i<<"*";
    }
    cout<<"\n";
  }
  i--;
  for(;i>=1;i--){
    for(int j=1;j<=i;j++){
      if(j==i)
        cout<<i;
      else
        cout<<i<<"*";
    }
    cout<<"\n";
  }
}