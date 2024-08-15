package com.LeetCode_Question;
import java.util.* ;
public class wordPattern {
    public static boolean wordPatterns(String pattern, String s) {
        String [] str=s.split(" ");
        if(str.length!=pattern.length()) return false;
        HashMap<Character,String> hm=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<str.length;i++) hs.add(str[i]);
        if(str.length!=1 && hs.size()==1) return false;
        HashSet<Character> hs2=new HashSet<>();
        for(int i=0;i<str.length;i++) hs2.add(pattern.charAt(i));
        if(hs.size()!=hs2.size()) return false;
        for(int i=0;i<str.length;i++){
            if(hm.containsKey(pattern.charAt(i))) {
                String result=hm.get(pattern.charAt(i));
                if(!result.equals(str[i])) return false;}
            else{
                hm.put(pattern.charAt(i),str[i]);
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String p="abba" ;
        String q = "dog cat cat dog";
        System.out.println(wordPatterns(p,q));

    }
}
