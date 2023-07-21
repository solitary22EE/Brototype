//program to use functions
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void getArray(int ar[],int n)

{
    printf("Enter the array elemnts :");
    for	(int i=0;i<n;i++)
    {
		scanf("%d",&ar[i]);
		
}
}

void displayArray(int ar[],int n)
{
	printf("Array element is :");
	 for	(int i=0;i<n;i++)
    {
	printf("%d\t",ar[i]);
	}
}

int main()
{
	int ar[100];
	int n=5;
	getArray(ar,n);
	displayArray(ar,n);
	return 0;
	}
