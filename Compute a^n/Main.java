#include<iostream>
int power(int a,int n){
  if(n==0)
    return 1;
  else
    return a*power(a,n-1);
}
using namespace std;
int main()
{
 int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);//Type your code here.
}