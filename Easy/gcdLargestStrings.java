package Easy;

import java.util.Scanner;
public class gcdLargestStrings
{
	public String gcdStrings(String str1,String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();

		if(!((str1+str2).equals(str2+str1)))
		{
			return "";
		}
		String result = str1.substring(0,gcd(len1,len2));
		return result;

	}
	private int gcd(int num1,int num2) //helper function
	{
		if(num2==0)
		{
			return num1;
		}
		return gcd(num2,num1 % num2);
	}
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		gcdLargestStrings obj = new gcdLargestStrings();
		System.out.println("Enter two Strings ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		String result = obj.gcdStrings(s1,s2);
		if(result != "")
			System.out.println("GCD of Two Strings is "+result);
		else
			System.out.println("Both strings are different");

		}
}