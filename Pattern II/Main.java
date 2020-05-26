#include<iostream>
using namespace std;
int main(){
  int n,i=1,no=1;
  cin>>n;
  while(i<=n){
    if(i%2!=0){
      for(int j=1;j<=i;j++){
        if(j==i)
          cout<<no++;
        else
          cout<<no++<<"*";
      }
      cout<<"\n";
    }
    else{
      no+=i-1;
      int k=no;
      for(int j=1;j<=i;j++){
        if(j==i)
          cout<<k;
        else
          cout<<k--<<"*";
      }
      no++;
      cout<<"\n";
    }
    i++;
  }
}