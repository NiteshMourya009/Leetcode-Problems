package com.LeetCode_Question;

public class validPalindrom {
    public static boolean isPalindrome(String s) {
        String str= s.toLowerCase() ;
        String ptr="" ;
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i) ;

            int ascii= (int) ch ;
            if(ascii>96 && ascii<123 || ascii>47 && ascii<58 ){
                if(ch!=',' && ch !=':') {
                    ptr += String.valueOf(ch) ;
                }
            }
        }
        int i=0;
        int j= ptr.length()-1 ;

        while(i<j){
            if(ptr.charAt(i) != ptr.charAt(j)){

                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
    public static void main(String[] args) {
        String s= "0P";
        System.out.println(isPalindrome(s));
    }
}
