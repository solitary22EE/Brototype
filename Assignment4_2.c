#include<stdio.h>
#include<stdlib.h>
int main()
{
	int size,i;
	int array[100];
	printf("Enter the size of the array: ");
	scanf("%d",&size);
	printf("Enter the array elements : ");
	
	for(i=0;i<size;i++)
	{
	   scanf("%d",&array[i]);
    }
    int temp=0;
    for(int j=0;j<size;j++)
    {
		if(array[j]%2==0)
		{
			temp =temp+1;
			
		}

}
printf("Number of even numbers in the given array i: %d",temp);
}
