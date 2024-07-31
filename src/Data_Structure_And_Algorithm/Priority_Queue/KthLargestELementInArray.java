package Data_Structure_And_Algorithm.Priority_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestELementInArray {
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()) ;
        for(int i=0; i<nums.length; i++){
            int a= Integer. parseInt(nums[i]) ;
            pq.add(a) ;
        }
        String str= "" ;
        int count =1 ;
        while(count!=k){
            pq.poll() ;
            count++ ;
        }
        return pq.peek().toString() ;

    }
    public static void main(String[] args) {
        String[]nums= {"2","21","12","1"} ;
        int k= 3 ;
        System.out.println(kthLargestNumber(nums,k));
    }
}
