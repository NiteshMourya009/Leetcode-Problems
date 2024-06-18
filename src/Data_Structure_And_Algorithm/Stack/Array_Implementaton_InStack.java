package Data_Structure_And_Algorithm.Stack;



public class Array_Implementaton_InStack {

    public static  class Stack{
        private int[]arr= new int[5];
        int idx= 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return ;
            }
            arr[idx]= x ;
            idx++ ;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1 ;
            }
            return arr[idx-1] ;
        }
        int pop(){
           if(idx==0){
               System.out.println("Stack is empty!");
               return -1 ;
           }
           int top= arr[idx-1];
           arr[idx-1]= 0 ;
           idx-- ;
           return top;
        }
        void display(){
            for(int i=0; i<= idx-1 ; i++){
                System.out.println(arr[i]+ " ");
            }
            System.out.println();
        }
        int size(){
            return idx ;
        }
        boolean isEmpty(){
            if(idx==0) return true ;
            else return false ;
        }
        boolean isFull(){
            if(idx==arr.length) return true ;
            else  return false ;
        }
        int capacity(){
            return arr.length ;
        }

    }


    public static void main(String[] args) {
        Stack st= new Stack() ;
        st.push(4);
        st.push(5);
        st.push(8);
        st.display() ;  // 4 5 8
        System.out.println(st.size());
        st.pop();
        st.display();  // 4 5
        st.push(9);
        st.push(10);
        st.push(14);
        st.push(16);
        st.display();

    }
}
