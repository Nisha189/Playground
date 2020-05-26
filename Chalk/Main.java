#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int c,count=0,chk;
  std :: cin>>c;
  count=c;
  chk=c*(1/sqrt(c));
  while(chk>1){
    count=count+chk;
    chk=chk*(1/sqrt(c));}
  std :: cout<<count+1;//Type your code here.
}