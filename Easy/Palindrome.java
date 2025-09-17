package Easy;
import java.util.Scanner;
public class Palindrome {
    boolean isPalindrome(int x){
        int rem = 0;
        int rev = 0;
        if(x<0)
        {
            return false;
        
        }
        int temp = x;
        while(temp!=0){
            rem = temp % 10; // TO take the reaminder  
            rev = rev * 10 + rem; // TO add the last digit to reversed number 
            temp = temp / 10;   //To take the 1 digit less than the number 
        }
        return x == rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Palindrome pd = new Palindrome();
        int digit=0;
        System.out.println("Enter a digit");
        digit = sc.nextInt();
        boolean result = pd.isPalindrome(digit);
        if(result){
            System.out.println(digit + " is a Palindrome number");
        }
        else{
            System.out.println(digit + " is not a Palindrome number");  
        }
        sc.close();
    }
}
