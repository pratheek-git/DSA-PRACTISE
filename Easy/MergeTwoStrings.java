/*
DSA - 4th Question
Merge Two Strings Alternatively
{a b c} and {p  q r} should be {apbqcr}
First take two Strings and find the min between them and find the length of the strings and find the min and then append iteratively each other and then add it to the new stringBuilder and then after
the loop add the remaining strings to the stringbuilder and convert it to string
*/
package Easy;
import java.util.Scanner;
class MergeTwoStrings{

	public static String MergeTwo(String word1, String word2)
	{
		String longerString="";
		int len1 = word1.length();
		int len2 = word2.length();

		int min = Math.min(len1,len2);

		if(len1 == min)
			longerString = word2;
		else
			longerString = word1;


		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();

		StringBuilder result = new StringBuilder();
		for(int i=0;i<min;i++)
		{
			result.append(w1[i]);
			result.append(w2[i]);
		}
		result.append(longerString.substring(min));
		return result.toString();
	}
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		MergeTwoStrings mg = new MergeTwoStrings();
		String res = mg.MergeTwo(s1,s2);
		System.out.println("Merged Strings Alternatively : "+res);
	}
}

