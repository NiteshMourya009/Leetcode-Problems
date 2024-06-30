package com.LeetCode_Question;

public class jump_GameII {
    public static int canJump(int[]nums){
       int n= nums.length ;
       int l=0;
       int r=0 ;
       int jumps= 0 ;
       while (r< n-1){
           int far=0 ;
           for(int ind=l; ind<= r; ind++){
               far= Math.max(far, ind+nums[ind]) ;
           }
           jumps++ ;
           l= r+1 ;
           r= far ;
       }
       return jumps ;
    }
    public static void main(String[] args) {
        int[]nums= {2,3,0,1,4};
        System.out.println(canJump(nums));
    }
}
