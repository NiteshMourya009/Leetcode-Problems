package com.LeetCode_Question;

public class shuffle_theArray {
    public static int[]shuffle(int[]nums, int n){
        int m= nums.length ;
        int[]num1= new int[n];
        int[]num2=new int[n];
        int[]ans = new int[2*n];
        for(int i=0; i<n; i++){
            num1[i]=nums[i];
        }
        int s=0 ;
        for(int i=n; i<m; i++){
            num2[s++]= nums[i];
        }
        int p=0;
        int k=0 ;
        for(int i=0; i<m; i++){
            if(i%2==0){
                ans[i]= num1[p] ;
                p++ ;
            }
            else{
                ans[i]= num2[k] ;
                k++;
            }
        }
        return ans ;

    }
    public static void main(String[] args) {

        int[]nums= {2,5,1,3,4,7};
        int n= nums.length/2 ;
        int[] ans= shuffle(nums,n);
        System.out.println(ans);
    }
}
