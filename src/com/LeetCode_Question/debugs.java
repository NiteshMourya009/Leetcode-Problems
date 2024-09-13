package com.LeetCode_Question;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

//public class debugs {
//
//    // Method to find numbers with unique digits in a given range [low, high]
//    public static int findNumbersWithUniqueDigits(int low, int high) {
//        //List<Integer> result = new ArrayList<>();
//         int count =0 ;
//        // Iterate through each number in the range
//        for (int num = low; num <= high; num++) {
//            if (hasUniqueDigits(num)) {
//                count++  ;
//            }
//        }
////       return co/unt ;
//        return count ;
//    }
//
//    // Helper method to check if a number has unique digits
//    private static boolean hasUniqueDigits(int num) {
//        boolean[] digitSeen = new boolean[10]; // Array to track digits seen
//        int originalNum = num;
//
//        while (num > 0) {
//            int digit = num % 10; // Get the last digit
//            if (digitSeen[digit]) {
//                return false; // Digit already seen
//            }
//            digitSeen[digit] = true; // Mark the digit as seen
//            num /= 10; // Remove the last digit
//        }
//
//        return true; // All digits are unique
//    }
//
//    public static void main(String[] args) {
//        int low = 10;  // Example range start
//        int high = 20; // Example range end
//
//        int result = findNumbersWithUniqueDigits(low, high);
//        System.out.println("Numbers with unique digits in range [" + low + ", " + high + "] are: " + result);
//    }
//}

class debugs {
    public static boolean possible(int[]bloomDay, int day, int m, int k){
        int cnt =0 ;
        int noOfBukey= 0;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                cnt++ ;
            }
            else{
                noOfBukey += (cnt/k) ;
                cnt =0 ;
            }
        }
        noOfBukey += cnt/ k ;
        if(noOfBukey >= m){
            return true ;

        }
        return false ;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1 ;
        }
        int low= Integer.MAX_VALUE ;
        int max= Integer.MIN_VALUE ;
        for(int i=0; i< bloomDay.length; i++){
            low =Math.min(low, bloomDay[i]) ;
            max= Math.max(max, bloomDay[i]) ;
        }
        for(int i= low; i<=max; i++){
            if(possible(bloomDay, i, m, k)){
                return i ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[]arr={1,10,3,10,2};
        int m=3 ;
        int k=1 ;
        System.out.println(minDays(arr,m,k));
    }
}