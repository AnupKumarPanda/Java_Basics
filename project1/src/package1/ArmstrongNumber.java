package package1;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static boolean isArmstrongNumber(int num)
	{
		int basenum= num;
		int x=0;
		while(num!=0)
		{
			int y= num%10;
			x= x+(y*y*y);
			num =num/10;
		}
		if(x==basenum)
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
		int s =sc.nextInt();
		if(isArmstrongNumber(s)== true)
		{
			System.out.println(s+" is an Armstrong Number");
		}
		else
		{
			System.out.println(s+" is not  an Armstrong Number");
		}

	}

}
