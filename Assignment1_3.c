#include<stdio.h>
int main()
{
   int P;
   float R,n,SI;
   
   printf("Enter the Principal Amount :");
   scanf("%d",&P);
   printf("Enter the Intersate Rate :");
   scanf("%f",&R);
   printf("Enter number of year :");
   scanf("%f",&n);
   SI = ((P*R*n)/100);
   printf("Simple interest :%f",SI);
   return 0;
   
}
