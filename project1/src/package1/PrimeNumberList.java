package package1;

import java.util.Scanner;

public class PrimeNumberList 
{
	public static void main(String[] args) 
	{
		//Enter a number 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a positive limit for printing prime number");
		int limit =sc.nextInt();
		System.out.println("The list of prime number is:");
		for(int num=2;num<=limit;num++)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(num+",");
			}
		}

	}
}
