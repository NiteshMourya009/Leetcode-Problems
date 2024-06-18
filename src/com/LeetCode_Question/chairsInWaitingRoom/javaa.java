package com.LeetCode_Question.chairsInWaitingRoom;

public class javaa {
    public static int waitingRoom(String s){
        int count=0;
        int max =0;
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)=='E'){
                count++ ;
                max=Math.max(max,count);
            }
            else if( s.charAt(i)=='L'){
                count-- ;
            }
        }
        return max ;

    }
    public static void main(String[] args) {
        String s="ELEELEELLL";
        System.out.println(waitingRoom(s));
    }
}
