#include<iostream>
int main()
{
  int n;
 std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
      {
std::cin>>a[i];
}
      int m,flag=0;
      std::cin>>m;
      for(int i=0;i<n;i++)
 {
	if(m==a[i])
 	{
	flag=1;
     break;
    }
 }
if(flag==1)
   std::cout<<"She passed her exam" ;
      else
      std::cout<<"She failed" ;
      }