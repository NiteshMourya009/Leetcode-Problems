package Data_Structure_And_Algorithm.Heap;

import java.util.ArrayList;
import java.util.List;

// Insertion In Min Heap 
public class InsertionInHeap {
    public static void swap(List<Integer>heap, int l, int r){
        int temp= heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp) ;
    }
    public static void push_up_in_minHeap(List<Integer> heap, int i){
        int parent_index= (i-1)/2  ;
        if(i==0 || heap.get(parent_index) < heap.get(i)){
            return ;
        }
        //  swap
          swap(heap,i, parent_index);
        // untill reached / correct position found
        push_up_in_minHeap(heap,parent_index);
    }
    public static void insert_In_MinHeap(List<Integer>heap, Integer element){
        // Last me add Karo
         heap.add(element) ;
         int index= heap.size()-1 ;
         push_up_in_minHeap(heap,index) ;
    }
    public static void main(String[] args) {
        List<Integer>heap= new ArrayList<>() ;
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);

        insert_In_MinHeap(heap, 5);
        System.out.println(heap);
    }
}
