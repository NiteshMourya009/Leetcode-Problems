package com.LeetCode_Question;

public class binarySubarraysWithSum {
    public static  int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length ;
        int sum=0;
        int count=0 ;
        for(int i=0; i<n-1; i++){
            sum+=nums[i];
            for(int j=i+1; j<n; j++){
                sum+= nums[j];
                if(sum==goal){
                    count++ ;
                }


            }
            sum=0 ;
        }
        return count ;
    }
    public static void main(String[] args) {
        int[]nums={1,0,1,0,1};
        int goal =2 ;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
}
