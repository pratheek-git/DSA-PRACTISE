/* Anagram problem
Compare two Strings and they should be of same frequencies and same same characters danger and garden
Normal method
Take two Strings and trim, lower case and then convert it to tocharArray and check both are equal
Time Complexity = O(nlogn)
*/
package Easy;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram
{
	public static boolean isAnagram(String s1,String s2)
	{
		String st1 = s1.replaceAll("\\s","").toLowerCase();
		String st2 = s2.replaceAll("\\s","").toLowerCase();

		if(s1 == null || s2 == null || s1.length() != s2.length())
		{
			return false;
		}

		char sd1[] = st1.toCharArray();
		char sd2[] = st2.toCharArray();

		Arrays.sort(sd1);
		Arrays.sort(sd2);


		return Arrays.equals(sd1,sd2);

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String s1,s2;
		System.out.println("Enter first String");
		s1 = sc.nextLine();
		System.out.println("Enter Second String");
		s2 = sc.nextLine();
		boolean result = isAnagram(s1,s2);
		if(result)
			System.out.println("Anagram");
		else
			System.out.println("Is not a Anagram");

		}
}
