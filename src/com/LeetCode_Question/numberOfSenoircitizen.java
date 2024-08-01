package com.LeetCode_Question;

public class numberOfSenoircitizen {
    public static int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            int num = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');
            if( num > 60){
                count++ ;
            }
        }
        return count++ ;

    }
    public static void main(String[] args) {
        String[]s= {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(s));
    }
}
