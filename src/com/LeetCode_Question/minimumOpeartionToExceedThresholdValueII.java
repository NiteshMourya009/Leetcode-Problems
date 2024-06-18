package com.LeetCode_Question;
import java.util.* ;
public class minimumOpeartionToExceedThresholdValueII {
    public static int minOperations(int[] nums, int k) {

        int n= nums.length ;
        int count=0 ;
     //   int min=0 ;
     //   int max= 0 ;
        int sum=0 ;
        Arrays.sort(nums);
        int[]ans= new int[n-1];
        for(int i=0; i<n; i++){
            sum= nums[i]*2+ nums[i+1];

            nums[i+1]= sum ;
            count++ ;
            Arrays.sort(nums);
            if(nums[i+1]>=k){
                return  count ;
            }

        }
        return count ;

    }
    public static void main(String[] args) {

        int[]nums={1,1,2,4,9};
        int k= 20 ;
        System.out.println(minOperations(nums,k ));

    }
}
