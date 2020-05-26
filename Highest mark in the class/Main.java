#include<iostream>
int main()
{
 int n,i,value,j;
  std :: cin>>n;
  int a[n];
  for(int i=0;i<=n;i++){
    std :: cin>>a[i];}
  value=a[0];
  for(int i=1;i<n;i++){
    if(a[i]>value)
      value=a[i];}
  std :: cout<<value;
  return 0;// Type your code here
}