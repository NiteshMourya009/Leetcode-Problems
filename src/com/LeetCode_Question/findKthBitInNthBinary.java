package com.LeetCode_Question;

public class findKthBitInNthBinary {
    public static String invert(StringBuilder sk){
        StringBuilder sl= new StringBuilder(sk) ;
        String s= sl.reverse().toString() ;
        int n= s.length() ;

        char[] ch= s.toCharArray() ;
        for(int i=0; i<n; i++){
            if(ch[i]=='0'){
                ch[i]= '1' ;
            }
            else{
                ch[i]='0' ;
            }
        }
        String ptr="";
        for(int i=0; i<n; i++){
            ptr +=String.valueOf(ch[i]) ;
        }
        return ptr ;
    }
    public static char findKthBit(int n, int k) {
        StringBuilder st= new StringBuilder() ;
        for(int i=1; i<=n; i++){
            if(i==1){
                st.append("0");
            }
            else{
                String str = invert(st) ;
                st.append("1");
                st.append(str) ;
            }
        }
        char ph = st.charAt(k-1);
        return ph ;
    }
    public static void main(String[] args) {
        int n= 3 ;
        int k= 1 ;
        System.out.println(findKthBit(n,k));
    }
}
