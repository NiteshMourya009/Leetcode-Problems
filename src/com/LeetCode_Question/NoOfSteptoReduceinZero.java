package com.LeetCode_Question;

public class NoOfSteptoReduceinZero {
    public static int numberOfSteps(int num) {
        int count =0 ;
        while(num != 0){
            if(num%2==0){
                num /= 2 ;
                count++ ;

            }
            else if(num%2 !=0){
                num -=1 ;
                count++ ;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int num =14 ;
        System.out.println(numberOfSteps(num));
    }
}
