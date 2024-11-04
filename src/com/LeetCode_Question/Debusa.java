package com.LeetCode_Question;

public class Debusa {
    public static int lengthAfterTransformations(String s, int t) {
        StringBuilder sb= new StringBuilder(s) ;

        for(int i=0; i< t%26; i++) {
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == 'z') {
                    st.append("ab");

                } else {
                    st.append((char) (sb.charAt(j) + 1));

                }

            }
            sb = st;
        }
         return sb.length() ;
        //        int count =0 ;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='z'){
//                count++ ;
//            }
//        }
//
//        for(int i=0; i<count; i++){
//            sb.append("ab");
//        }
//        int length= sb.length() ;
//
//        int mod = t %26 ;
//        int val= 0 ;
//        for(int i=0; i<sb.length(); i++){
//            if( (char)(sb.charAt(i)+mod) < 'z'){
//                val= length ;
//            }
//            else{
//                val = length+1 ;
//            }
//            length= val ;
//        }
    }
    public static void main(String[] args) {
        String s= "cu" ;
        System.out.println(lengthAfterTransformations(s,5));
    }
}
