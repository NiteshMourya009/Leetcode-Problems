package Data_Structure_And_Algorithm.Priority_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLarge(int[]arr, int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        while(k!=1){
            pq.remove() ;
            k-- ;
        }
        return pq.peek() ;
    }
    public static void main(String[] args) {
        int[]arr= {3,7,2,9,5} ;
        int k=3 ;
        System.out.println(kthLarge(arr, k));
    }
}
