package com.LeetCode_Question;
import java.util.* ;
public class distributeElementIntoTwoArrays {
    public static int[]resultArray(int[]nums){

            int n= nums.length;
            Stack<Integer>st1= new Stack();
            Stack<Integer>st2= new Stack();

             st1.push(nums[0]);
            st2.push(nums[1]);
            for(int i=2; i<n; i++){

                if(st1.peek()>st2.peek()){
                    st1.push(nums[i]);
                }
                else{
                    st2.push(nums[i]);
                }
            }
            Stack<Integer>st3= new Stack();
            while(st2.size()>0){
                st3.push(st2.pop());
            }
            while(st1.size()>0){
                st3.push(st1.pop());
            }
            int[] ans= new int[st3.size()];
            int k=0 ;
            while(st3.size()>0){
                ans[k]= st3.pop() ;
                k++ ;
            }
            return ans ;
    }
    public static void main(String[] args) {

        int[]nums= {5,4,3,8};
        int[] ans2= resultArray(nums);
        System.out.println(ans2);
    }
}
