#include<iostream>
using namespace std;
void ans(int n){
  if(n/10==0){
    cout<<n;
    return;
  }
  else{
    int temp=0;
    while(n>0){
      temp+=n%10;
      n/=10;
    }
    ans(temp);
  }
}
int main(){
  int n;
  cin>>n;
  ans(n);
}