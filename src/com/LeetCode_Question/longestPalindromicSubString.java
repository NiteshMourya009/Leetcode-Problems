package com.LeetCode_Question;

public class longestPalindromicSubString {
    public static boolean isPalindrom(String str){
        int i=0 ;
        int j=str.length()-1 ;

        if(str.length()==2 && str.charAt(0)!=str.charAt(1)){
            return false ;
        }
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false ;
            }
            i++;
            j-- ;
        }
        return true ;
    }
    public static String longestPalindrome(String s) {
        int n= s.length() ;
        String str="" ;
        if(n<=1){
            return s ;
        }
        if(n==2 && !isPalindrom(s)){
            return String.valueOf(s.charAt(0));

        }
        int max= -1 ;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrom(s.substring(i,j+1))){
                    if(max<s.substring(i,j+1).length()){
                        str="";
                        max=s.substring(i,j+1).length() ;
                        str +=s.substring(i,j+1);
                    }
                }
                //    else {

                //    }
            }
        }
        return str ;

    }
    public static void main(String[] args) {
        String s= "abcba";
        System.out.println(longestPalindrome(s));
    }
}
