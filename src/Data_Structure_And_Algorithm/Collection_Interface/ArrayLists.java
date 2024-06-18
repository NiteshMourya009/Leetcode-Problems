package Data_Structure_And_Algorithm.Collection_Interface;
//import java.util.ArrayList ;
import java.util.* ;

public class ArrayLists {
    static  void ArrayListExample() {
    ArrayList<Integer> l = new ArrayList<>();

        l.add(2);
        l.add(4);
        l.add(6);

        System.out.println(l);

        System.out.println(l.get(1));

        l.set(1,8); // for Modifying the element at index i ;
        System.out.println(l);

        System.out.println(l.contains(6));  // return true
    }
    static  void LinkedListExample() {
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Example of LinkedList");
        l1.add(2);
        l1.add(4);
        l1.add(6);

        System.out.println(l1);

        System.out.println(l1.get(1));

        l1.set(1,8); // for Modifying the element at index i ;
        System.out.println(l1);

        System.out.println(l1.contains(6));  // return true
    }
    static void StackExamples(){
        Stack<String> st= new Stack<>();
        st.push("Nitesh");
        st.push("Mourya");
        st.push("Piyush");
        st.push("Mourya") ;
        System.out.println(st);

        System.out.println(st.size());
        System.out.println(st.empty());

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());


    }


    public static void main(String[] args) {

      //  ArrayListExample();
      //  LinkedListExample();

        StackExamples();
    }
}
