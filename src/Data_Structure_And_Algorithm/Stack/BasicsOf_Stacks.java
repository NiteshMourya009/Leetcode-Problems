package Data_Structure_And_Algorithm.Stack;

import java.util.Stack;

public class BasicsOf_Stacks {
    public static void main(String[] args) {

        Stack<Integer> st= new Stack<>() ;

        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(10);

        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println("Size is:"+ st.size());

        // for first element ;
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);
    }
}
