package com.LeetCode_Question;

public class Add_Binary {
    public static String addBinary(String a, String b) {
        StringBuilder st= new StringBuilder() ;
        int k= Math.max(a.length(), b.length()) ;
        int x =0 ;
        int y =0 ;
        int carry =0 ;
        int p= a.length()-1 ;
        int q=b.length()-1 ;
        while(p !=-1 || q!= -1 && carry !=0){
            if(p>=0){
                x=a.charAt(p)-'0';
                p-- ;
            }
            else{
                x= 0 ;
                p-- ;
            }
            if(q >= 0){
                y= b.charAt(q)-'0';
                q-- ;
            }
            else{
                y =0 ;
                q-- ;
            }
            int val= x+ y + carry ;
            int ans=val %2 ;
            st.append(ans) ;
            carry= val/2 ;
        }
        return st.toString() ;
    }
    public static void main(String[] args) {
        String a="11" ;
        String b= "1";
        System.out.println(addBinary(a,b));
    }
}
