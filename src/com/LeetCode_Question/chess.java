package com.LeetCode_Question;

public class chess {
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1= coordinate1.charAt(0)-'a'+1 ;
        int r1=  coordinate1.charAt(1) -'0';

        int c2= coordinate2.charAt(0)-'a'+1;
        int r2=  coordinate2.charAt(1)-'0';

        if(r1%2 ==0 && r2%2==0){
            if( c1%2  ==1 && c2%2== 1){
                return true ;
            }
            else if(c1%2  == 0 && c2%2== 0){
                return true ;
            }
        }
        else if(r1%2 ==1 && r2%2== 1){
            if( c1%2  ==1 && c2%2== 1){
                return true ;
            }
            else if(c1%2  == 0 && c2%2== 0){
                return true ;
            }
        }
        else if(r1%2 ==1 && r2%2!=0){
            if(c1%2==0 && c2%2 ==1){
                return true ;
            }
            else if(c1%2==1 && c2%2 ==0){
                return true ;
            }
        }else {
            if(c1%2==0 && c2%2 ==1){
                return true ;
            }
            else if(c1%2==1 && c2%2 ==0){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        String a="a1";
        String b="h3" ;
        System.out.println(checkTwoChessboards(a,b));
    }
}
