package Data_Structure_And_Algorithm.HasMap;

import java.util.HashSet;

public class Longest_ConsecutiveSequence {

    public static int longestCOnsecutive(int[]nums){
        HashSet<Integer> st= new HashSet<>();

        for(int num : nums){
            st.add(num) ;
        }
        int maxStreak = 0 ;
        for(int num:st){
            if( !st.contains(num-1)){ // num is starting point of a sequence
                 int currNum= num ;
                 int currStreak= 1 ; // length of current consecutive sequence
                 while (st.contains(currNum+1)){
                     currStreak++ ;
                     currNum++ ;
                 }
                 maxStreak= Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {


     }
}





















