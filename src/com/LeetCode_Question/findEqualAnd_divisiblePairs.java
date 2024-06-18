package com.LeetCode_Question;

public class findEqualAnd_divisiblePairs {

    public static int countPairs(int[]nums, int k){
        int n= nums.length ;
        int count= 0 ;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    if((i*j)%k==0)
                        count++ ;

                }

            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[] nums= {3,1,2,2,2,1,3};
        int k=2 ;
        countPairs(nums, k) ;
    }
}
