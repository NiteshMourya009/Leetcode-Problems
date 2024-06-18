package Data_Structure_And_Algorithm.HasMap;

import java.util.HashMap;

// Anagrams are the those string which contain same element in itself
// No Character should be extra or different
// Ex:-  Listen and silent are Anagram
public class Valid_Anagram {

      static HashMap<Character, Integer> makefreqMap(String str){
          HashMap<Character, Integer> mp= new HashMap<>() ;
           for(int i=0; i< str.length(); i++){
               Character ch = str.charAt(i) ;
               if(! mp.containsKey(ch)){
                   mp.put(ch, 1) ;
               }
               else{
                   mp.put(ch, mp.get(ch)+1) ;
               }
           }
           return mp ;
      }
     public static boolean isAnagram2(String s, String t){
        if(s.length()!= t.length())   return false ;

        HashMap<Character,Integer> mp1=makefreqMap(s);
        HashMap<Character, Integer> mp2= makefreqMap(t) ;

        return mp1.equals(mp2) ;
      }

      public static  boolean isAnagram(String s, String t){
          if(s.length() != t.length()) return false ;

          HashMap<Character, Integer> mp= makefreqMap(s) ;
          for(int i=0; i< t.length(); i++){
              Character ch= t.charAt(i) ;
              if(! mp.containsKey(ch)) return false ;
              int currfreq= mp.get(ch) ;
              mp.put(ch, currfreq-1) ;
          }
          for(Integer i: mp.values()){
              if(i != 0) return false ;
          }
          return true ;
      }



    public static void main(String[] args) {

        String s= "silent" ;
        String t= "listen" ;

        System.out.println(isAnagram(s,t));
    }
}
