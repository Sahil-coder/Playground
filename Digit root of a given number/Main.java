#include<iostream>
using namespace std;
int droot(int n)
{
if(n==0)
  return 0;
   return n%10 + droot(n/10) ;
}

int main()
{
int n,m;
  std::cin>>n;
  m=droot(n);
  while(1)
  {
    if(m>9)
    {  m=droot(m);
    continue;
  }
    else
      break;
  }
  std::cout<<m ;
  return 0;
}
	