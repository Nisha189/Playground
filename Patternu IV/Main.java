#include <iostream>
using namespace std;
int main() {
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      printf("%d",i+1);
    }
    for(j=1;j<n;j++)
    {
      printf("%d",i);
    }
    if(i%2!=0)
    {
      printf("%d",i+1);
    }
    printf("\n");
  }// Type your code here
    return 0;
}