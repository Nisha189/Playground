#include<iostream>
using namespace std;
int main()
{
  int a[10][10],transpose[10][10],row,column,i,j;
  cin>>row>>column;
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
      cin>>a[i][j];}}
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
      transpose[j][i]=a[i][j];}}
  for(int i=0;i<column;i++){
    for(int j=0;j<row;j++){
      cout<<transpose[i][j]<<" ";
      if(j==row-1)
        cout<<endl;}}
}