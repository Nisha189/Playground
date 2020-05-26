#include<iostream>
int main()
{
  int n,i,a,flag=0;
  std :: cin>>n;
  int arr[n];
  for(i=0;i<n;i++){
    std :: cin>>arr[i];}
  std :: cin>>a;
  for(i=0;i<n;i++){
    if(arr[i]==a){
      flag=1;break;
    }}
  (flag==1)?std :: cout<<"She passed her exam":std :: cout<<"She failed";// Type your code here
}