//package com.LeetCode_Question;
//
//public class minimizeSteporeachKByAddingOneOrDoub {
//    public static int MinOperation(int sum,int k){
//        if(sum==k){
//            return 1 ;
//        }
//        int take= MinOperation(sum+1, k) ;
//        int nttake= MinOperation(sum*sum,k);
//        return Math.min(take,nttake) ;
//    }
//    public static void main(String[] args) {
//        int k=4 ;
//        System.out.println(MinOperation(1,k));
//    }
//}
