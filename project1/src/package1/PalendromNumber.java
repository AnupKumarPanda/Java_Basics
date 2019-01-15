package package1;

import java.util.Scanner;

public class PalendromNumber
{
	public static boolean isPalendromNumber(int num)
	{
		int basenum=num;
		int rev =0;
		while(num!=0)
		{
			int x= num%10;
			rev= (rev*10)+x;
		    num= (int)(num/10);
		}
		if(rev==basenum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		if(isPalendromNumber(n)==true)
		{
			System.out.println(n+" is Palendrom number");
		}
		else 
		{
			System.out.println(n+" is not apalendrom number");
		}
		
	}

}
