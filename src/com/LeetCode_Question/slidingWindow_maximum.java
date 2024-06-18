package com.LeetCode_Question;

import java.util.Stack;

public class slidingWindow_maximum {
    public static  int[] maxSlidingWindow(int[]nums, int k){
      //   Method 01:- Time complexity is n*k (n^2);
        int n= nums.length ;
        int[]ans=new int [n-k+1];
        int c=0;
        for(int i=0; i<n-k+1; i++){
            int max= Integer.MIN_VALUE ;
            for(int j=i; j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            ans[c++]= max ;
        }
        return ans ;
    }
    // Method 02
    public static int[] maxSlidingWindows(int[]nums, int k){
        int n=nums.length ;
        int[]ans= new int[n-k+1];
        int z=0 ;
        Stack<Integer> st= new Stack<>() ;
        int[]nge =new int[n];
        st.push(n-1);
        nge[n-1]= n ;
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && nums[i]>nums[st.peek()])
                st.pop() ;
            if(st.size()==0) nge[i] = n ;
            else nge[i] = st.peek() ;
            st.push(i);

        }
        int j=0 ;
        for(int i=0; i<n-k+1; i++){
            if(j>=i+k)  j=i ;
            int max= nums[j];
            while(j<i+k){
                max= nums[j];
                j= nge[j] ;
            }
            ans[z++] = max ;
        }

     return ans ;
    }

    public static void main(String[] args) {

        int[]num={1,3,-1,-3,5,3,6,7};
        int k= 3;
        System.out.println(maxSlidingWindow(num,k));
        System.out.println(maxSlidingWindows(num, k));

    }
}
