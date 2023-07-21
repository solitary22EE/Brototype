#include<stdio.h>
int main()
{
	float mark;
	printf("Enter your mark: ");
	scanf("%f",&mark);
	
  if(mark>=90)
	{
		printf("A");
	}
  else if(mark<=89 && mark>80)
	{
		printf("B");
    }
  else if(mark<=79 && mark>70)
	{
		printf("C");
    }
  else if(mark<=69 && mark>60)
	{
		printf("D");
    }
  else if(mark<=59 && mark>50)
	{
		printf("E");
    }
  else {
	printf("Faild");
   }

return 0;
}
