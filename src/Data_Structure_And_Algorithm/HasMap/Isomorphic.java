package Data_Structure_And_Algorithm.HasMap;

// Two String 's' and 't' are isomorphic if the character is 's' can be replaced to get 't' .
// Ex; xxy and aab

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    private static boolean isIsomorphic01(String s, String t){
        HashMap<Character, Character> mp= new HashMap<>();
        if(s.length() != t.length()) return false ;
        for(int i=0; i<s.length(); i++){
            Character sch= s.charAt(i) ;
            Character tch= t.charAt(i) ;

            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch) return false ;
            }
            else if(mp.containsValue(tch)){
                 return false ;
            }
            else{
                mp.put(sch,tch) ;
            }
        }
        return  true ;
    }
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character>mp= new HashMap<>();
        HashSet<Character>st= new HashSet<>();
        if(s.length() != t.length()) return false ;
        for(int i=0; i<s.length(); i++){
            Character sch= s.charAt(i) ;
            Character tch= t.charAt(i) ;

            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch) return false ;
            }
            else if(st.add(tch)){
                return false ;
            }
            else{
                mp.put(sch,tch) ;
                st.add(tch);
            }
        }
        return  true ;
    }
    public static void main(String[] args) {
        String  s= "abcaccb";
        String t=  "xyzxzzy" ;
        System.out.println(isIsomorphic01(s,t));
    }
}
