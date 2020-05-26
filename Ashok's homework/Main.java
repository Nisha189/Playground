#include<iostream>
int main()
{
  int r,c;
  std :: cin>>r>>c;
  int i=0,j=0;
  int m1[r][c],m2[r][c],sum[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std :: cin>>m1[i][j];}}
     for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std :: cin>>m2[i][j];}} 
        for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
            sum[i][j]=m1[i][j]+m2[i][j];}}
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
            std :: cout<<sum[i][j]<<" ";
    if(j==c-1)
    std :: cout<<"\n";}}// Type your code here
}