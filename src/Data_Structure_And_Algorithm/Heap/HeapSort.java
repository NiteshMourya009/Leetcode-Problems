package Data_Structure_And_Algorithm.Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static void heapsort(List<Integer>arr){
        Heapify(arr);
        int n=arr.size()-1 ;

        for(int i= n; i>=0; i--){
            swap(arr, 0, i);
            push_inHeap(arr, 0, i-1);
        }
    }
    public static void swap(List<Integer>heap, int l, int r){
        int temp= heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp) ;
    }
    public static void Heapify(List<Integer>arr){
        int firstNonLeafNode= ((arr.size()-1)-1) /2 ;

        for(int i= firstNonLeafNode; i>=0; i--){
            push_inHeap(arr,i,arr.size()-1);
        }
    }
    public static void push_inHeap(List<Integer>heap,int i, int n){
        if(i==0){
            return ;
        }
        int left= (i*2)+1 ;
        int right=(i*2) +2 ;
        int smallest= i ;

        if(left<=n && heap.get(left)<heap.get(smallest)){
            smallest= left ;
        }
        if(right <=n && heap.get(right)<heap.get(smallest)){
            smallest= right ;
        }
        if(smallest== i){
            return ;
        }
        swap(heap, smallest, i);

        push_inHeap(heap, smallest, n);
    }
    public static void main(String[] args) {
        List<Integer>heap= new ArrayList<>() ;
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);

        System.out.println(heap);

        Heapify(heap);
        System.out.println(heap);

        heapsort(heap);
        System.out.println(heap);

    }
}
