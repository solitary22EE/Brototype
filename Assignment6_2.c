#include <stdio.h>
#include <stdlib.h>
#include <string.h>

	void Addition(int Num1, int Num2)
	{
		int result = Num1 + Num2;
		printf("Result = %d",result);
	}
	
	void Subtraction(int Num1, int Num2)
	{
		int result = Num1 - Num2;
		printf("Result = %d",result);
	}
	
	void Multiplication(int Num1, int Num2)
	{
		int result = Num1 * Num2;
		printf("Result = %d",result);
	}
	
	void Division(int Num1, int Num2)
	{
		int result = Num1 / Num2;
		printf("Result = %d",result);
	}
	
	
	int main()
	{
		int Num1,Num2,choice;
		printf("Enter the 2 numbers :");
		scanf("%d %d",&Num1,&Num2);
		
		printf("1 ADDITION  \n2  SUBTRACTION    \n3  MULTLIPLICATION    \n4   DIVISION    \n5   EXIT\n");
		
		printf("Enter your choice ");
		scanf("%d",&choice);
		while{
		switch(choice)
		{
			case 1:
				Addition(Num1,Num2);
				break;
				
			case 2:
				Subtraction(Num1,Num2);
				break;
			
			case 3:
				Multiplication(Num1,Num2);
				break;
				
			case 4:
				Division(Num1,Num2);
				break;
			
			case 5:
				break;
				
			default:
			   printf("Enter valid charecter");
			   break;
			   
		  }
	  }do(choice = 5)

	
	
	
	
	
	
	return 0;
	}
