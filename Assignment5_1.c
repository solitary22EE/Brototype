#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
	char str[20],rev[20];
	
	printf("Enter the string : ");
	scanf("%s",str);
	
	int h = strlen(str);
	for(int i=h-1;i>=0;i--)
	{
		rev[h-1-i] = str[i];
		
	}
	
	if(strcmp(str,rev)==0)
	{
		printf("Palindrome");
	}
	else {
		printf(" Not Palindrome");
	}
	return 0;
}
