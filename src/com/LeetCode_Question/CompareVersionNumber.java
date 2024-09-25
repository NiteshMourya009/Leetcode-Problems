package com.LeetCode_Question;

public class CompareVersionNumber {
    public static int compareVersion(String version1, String version2) {
        String []arr = version1.split("\\.") ;
        String []arr1= version2.split("\\.");

        int i=0 ;
        int j=0 ;
        int a =0 ;
        int b =0 ;

        while(i < arr.length || j<arr1.length){
            if(i>= arr.length){
                a =0 ;
            }
            else {
                a= Integer.parseInt(arr[i++]) ;
            }
            if(j>= arr1.length){
                b=0 ;
            }
            else {
                b= Integer.parseInt(arr1[j++]);
            }
            if(a<b){
                return -1 ;
            }
            else if(a > b){
                return 1 ;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        String s1= "1.0.1";
        String s2= "1";
        System.out.println(compareVersion(s1, s2));
    }
}
