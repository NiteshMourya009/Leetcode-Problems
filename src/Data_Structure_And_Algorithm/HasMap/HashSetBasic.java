package Data_Structure_And_Algorithm.HasMap;

import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {

        HashSet<String> st= new HashSet<>() ;
        st.add("James");
        st.add("Scot");
        st.add("James");

        System.out.println(st); // James Scot
        System.out.println(st.contains("James")); // true
        System.out.println(st.size());

        st.remove("James");
        System.out.println(st.contains("James")); // Flase

        System.out.println(st.size());
        st.add("Nitesh");
        st.add("Mourya") ;
        for(String s: st){
            System.out.println(s);
        }
    }
}
