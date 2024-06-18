package Dyanmic_Programming.memoization;
import java.util.*;
public class palindrom_partitioning {
   private static  boolean isPalindrom(String s){
       int l=0;
       int r= s.length()-1 ;
        while(l<=r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false ;
            }
        }
       return  true ;
   }
    private static  void partitioningPalindrom(int idx, String s, List<List<String>>result, List<String>ans){
        if(idx == s.length() ){
            result.add(new ArrayList<>(ans)) ;
            return ;
        }
       for(int i=idx; i<s.length(); i++){
           String temp= s.substring(idx, i+1) ;
           if(isPalindrom(temp)){
               ans.add(temp) ;
               partitioningPalindrom(i+1,s,result, ans);
               ans.remove(ans.size()-1 ) ;
           }
       }

    }
    public static void main(String[] args) {
        String s= "aab" ;
        List<List<String>> result= new ArrayList<>() ;
        List<String> ans= new ArrayList<>() ;
        int idx= 0;

        partitioningPalindrom(idx,s,result,ans);
        System.out.println(result);


    }
}
