package com.LeetCode_Question;

public class AlternatingGroups {
    public static int numberOfAlternatingGroups(int[] colors) {
        int count =0 ;
        int n= colors.length ;
        for(int i=0; i<n; i++){
            if((i+3)<=n){
                if(colors[i] != colors[i+1] && colors[i+1] != colors[i+2]){
                    count++ ;
                }
            }
            else if( (i+3)>n && (i+2)==n){
                if(colors[i] != colors[i+1] && colors[i+1] != colors[0]){
                    count++ ;
                }
            }
            else if( (i+3)>n && (i+1)==n){
                if(colors[i] != colors[0] && colors[0] != colors[1]){
                    count++ ;
                }
            }


        }
        return count ;
    }
    public static void main(String[] args) {
        int[]nums= {1,1,1} ;
        System.out.println(numberOfAlternatingGroups(nums));
    }
}
