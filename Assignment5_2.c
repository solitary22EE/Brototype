//program to print sum of 2 metrix
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
	int ar1[100][100],ar2[100][100],sum[100][100];
	int size,i;
	
	
	printf("Enter the Size :  ");
	scanf("%d",&size);
	
	printf("Enter the first array :  ");
	for(i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
		scanf("%d",&ar1[i][j]);
	}
	printf("\n");
	}
	
	printf("Enter the secound array :  ");
	for(i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
		scanf("%d",&ar2[i][j]);
	}
	printf("\n");
	}
	
	
	for(i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
		 sum[i][j] =ar1[i][j] + ar2[i][j];
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	for(i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
	printf("%d\t",sum[i][j]);
	
}
printf("\n");
}
	return 0;
}
