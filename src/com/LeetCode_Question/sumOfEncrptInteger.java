package com.LeetCode_Question;

public class sumOfEncrptInteger {
    public static int encrpt(int num){
        int max =0 ;
        int no=0;
        while(num>=1){
            int count =num%10 ;
            max=Math.max(max,count);
            num= num/10 ;
            no++ ;
        }
        int i=0 ;
        int maxNum=0;
        while(i!=no){
            maxNum= maxNum*10+max ;
            i++;
        }
        return maxNum ;


    }
    public static int sumOfEncryptedInt(int[] nums) {

        int n=nums.length ;
        int sum=0 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<10){
                sum+=nums[i];

            }
            else{
                sum += encrpt(nums[i]) ;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        int[] nums= {50,573,34,11};
        System.out.println(sumOfEncryptedInt(nums));
    }
}
