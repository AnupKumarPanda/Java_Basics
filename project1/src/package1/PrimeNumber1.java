package package1;

import java.util.Scanner;

public class PrimeNumber1 
{
	public static boolean isPrimeNumber(int num)
	{
		//the smallest prime number is 2
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean result =isPrimeNumber(num);
		if(result==true)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
		
	}
	//A number is said to be prime number if it is only divisible by 1 and itself. 
	

}
