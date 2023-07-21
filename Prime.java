import java.util.*;
class Prime {
	
	public static void main(String [] args)
	{
		int flag =0;	
		System.out.println("Enter the number :  ");
		try (Scanner sc = new Scanner(System.in)) {
			int Num1 = sc.nextInt();
			for(int i =2 ;i<=Num1;i++)
			{
				if(Num1%i == 0)
				{
					flag = flag+1;

				}
			}
		}
		if(flag == 1)
		{
			System.out.println("The number is prime");
		}
		else  {
			System.out.println("The number is not prime");
		}
	}
}
