package Data_Structure_And_Algorithm.Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class Node{
   int first ;
   int second ;
   int dist ;

    Node(int first, int second, int dist){
       this.first= first ;
       this.second= second ;
       this.dist= dist ;
   }
}
public class KthClosestpointToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
          int m= points.length ;
          int n= points[0].length ;
          ArrayList<Integer>arr= new ArrayList<>() ;
          PriorityQueue<Node>pq= new PriorityQueue<>((a,b)->(b.dist-a.dist)) ;
          for(int i=0; i<points.length; i++){
              int sum= points[i][0]*points[i][0]+points[i][1]*points[i][1] ;
               if(pq.size()==k){
                   if( pq.peek().dist > sum){
                       pq.poll() ;
                       pq.add(new Node(points[i][0],points[i][1],sum)) ;
                   }
                   continue;

               }
              pq.add(new Node(points[i][0],points[i][1],sum)) ;
          }
          int[][] nums= new int[k][2] ;
          int p=0 ;
          while(!pq.isEmpty()){
              nums[p][0]= pq.peek().first ;
              nums[p][1]= pq.peek().second ;
              pq.poll() ;
              p++ ;
          }
          return nums ;
    }
    public static void main(String[] args) {
        int[][]nums= {{3,3}, {5,-1},{-2,4}};
        int k= 2 ;
        int[][]arr= kClosest(nums, k);
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i][0]+" ");
            System.out.println(arr[i][1]);
        }

    }
}
