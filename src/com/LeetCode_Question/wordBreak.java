package com.LeetCode_Question;
import java.util.* ;
public class wordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String , Integer> map = new HashMap<>() ;

        for(int i=0 ;i< wordDict.size() ; i++){
            if(!map.containsKey(wordDict.get(i))){
                map.put(wordDict.get(i) , 1) ;
            }
            else{
                map.put(wordDict.get(i) , map.get(wordDict.get(i))+1);
            }
        }
        int val =0 ;
        boolean flag =false ;
        for(int i=0; i<s.length(); i++){
            String str = s.substring(val, i+1);
            if(map.containsKey(str)){
                flag = true ;
                val =i+1 ;
            }
            else{
                flag = false ;
            }
        }
        if(flag){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        String s= "aaaaaaa";
        List<String> st = new ArrayList<>() ;
        st.add("aaaa");
        st.add("aaa") ;

        System.out.println(wordBreak(s, st));
    }
}
