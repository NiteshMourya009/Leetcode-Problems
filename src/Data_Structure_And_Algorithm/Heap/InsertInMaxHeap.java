package Data_Structure_And_Algorithm.Heap;

import java.util.ArrayList;
import java.util.List;

public class InsertInMaxHeap {
    public static void swap(List<Integer>heap, int l, int r){
        int temp= heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp) ;
    }
     public static void push_inMaxHeap(List<Integer>heap, int ind){
         int parent_ind= (ind-1)/2 ;
         if(ind==0 || heap.get(parent_ind)>heap.get(ind)){
             return ;
         }
         swap(heap, ind, parent_ind);
         push_inMaxHeap(heap, parent_ind);

     }
    public static void insert_in_MaxHeap(List<Integer>heap, int element){
        heap.add(element);
        int index =heap.size()-1 ;

        push_inMaxHeap(heap,index) ;
    }
    public static void main(String[] args) {
        List<Integer> heap= new ArrayList<>() ;
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println(heap);
        insert_in_MaxHeap(heap, 40);
        System.out.println(heap);
    }
}
