#include<iostream>
using namespace std;
void fib(int n,int a,int b,int c){
  if(c==n)
    cout<<"The term "<<n<<" in the fibonacci series is "<<a;
  else
    fib(n,b,a+b,++c);
}
int main()
{
 int c;
  cin>>c;
  fib(c,1,0,0);//Type your code here.
}