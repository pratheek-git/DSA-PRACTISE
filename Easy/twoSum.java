package Easy;
import java.util.*;

/* 
TWO SUM PROBLEM:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

USAGE : BRUTE FORCE APPROACH 
*/


class twoSum{
    public int[] tSum(int[] nums,int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
               
            }
        }
        return new int[] {-1,-1};
    }
   public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    twoSum ts = new twoSum();
    int n;
    System.out.println("Enter the number of elements in the array : ");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array ");
    for (int i=0;i<n;i++){
     arr[i] = sc.nextInt();
    }
    int target=0;
    System.out.println("Enter the target value:");
    target = sc.nextInt();
    int result[] = ts.tSum(arr,target);
    System.out.print("Two sum Position is : ");
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
   }
}