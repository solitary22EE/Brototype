#include<stdio.h>
int main()
{
	float mark;
	printf("Enter your mark");
	scanf("%f",&mark);
	
	if (mark<50)
	{
		printf("Your are failed");
	}
	else {
		printf("You are passed");
	}
	return 0;
}
