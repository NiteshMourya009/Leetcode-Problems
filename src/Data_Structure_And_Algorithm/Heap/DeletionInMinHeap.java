package Data_Structure_And_Algorithm.Heap;

import java.util.ArrayList;
import java.util.List;

public class DeletionInMinHeap {
    public static void swap(List<Integer>heap, int l, int r){
        int temp= heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp) ;
    }
    public static void push_Down_MaxHeap(List<Integer>heap, int ind){
        int n= heap.size()-1 ;
        if(ind==n){
            return ;
        }
         int left = (2*ind) +1 ;
         int right= (2*ind) +2 ;

         int smallest= ind ;

         if( left<= n && heap.get(left)< heap.get(smallest)){
             smallest= left ;
         }
        if( right<=n && heap.get(right)< heap.get(smallest)){
            smallest= right ;
        }
        if(smallest==ind){
            return ;
        }
        swap(heap, ind, smallest);

        push_Down_MaxHeap(heap, smallest);

    }
     public static void deletion_In_MinHeap(List<Integer>heap){
           swap(heap, 0, heap.size()-1);
           heap.remove(heap.size()-1) ;

           push_Down_MaxHeap(heap, 0);
     }
    public static void main(String[] args) {
        List<Integer>heap= new ArrayList<>() ;
        heap.add(5) ;
        heap.add(20) ;
        heap.add(10) ;
        heap.add(40) ;
        heap.add(50) ;
        heap.add(30) ;
        heap.add(60) ;
        System.out.println(heap);

        deletion_In_MinHeap(heap);
        System.out.println(heap);
    }
}
