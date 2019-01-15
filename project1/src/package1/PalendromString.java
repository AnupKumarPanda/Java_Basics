package package1;

import java.util.Scanner;

public class PalendromString 
{
	public static boolean isPalendromString(String s)
	{
		String rev="";
		int len=s.length()-1;
		for(int i=len;i>=0;i--)
		{
			char c =s.charAt(i);
			rev=rev+c;
		}
	
		System.out.println(rev);
		
		if(s.equals(rev))
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
		System.out.println("Enter the string");
		String s =sc.nextLine();
		if((isPalendromString(s))== true)
		{
			System.out.println(s+" is a palendrom string");
		
		}
		else
		{
			System.out.println(s+" is not a palendrom string");
		}

	}

}
