package Data_Structure_And_Algorithm.Priority_Queue;
import  java.util.* ;
class Nod{
    int val ;
    int sum ;
    Nod(int val, int sum ){
        this.val = val ;
        this.sum= sum ;
    }
}
public class Find_K_Closest_Elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length ;
        PriorityQueue<Nod> pq= new PriorityQueue<> ( (a,b) ->  (b.sum-a.sum)) ;
        List<Integer> nums= new ArrayList<>() ;
        for(int i=0; i< n; i++){
            if(pq.size()==k && pq.peek().sum>Math.abs(arr[i]-x)){
                pq.poll() ;
                pq.add(new Nod(arr[i], Math.abs(arr[i]-x))) ;
            }
            else if(pq.size()<k){
                pq.add(new Nod(arr[i], Math.abs(arr[i]-x))) ;
            }
        }
        while(!pq.isEmpty()){
            nums.add(pq.peek().val) ;
            pq.poll() ;
        }
        Collections.sort(nums) ;
        return nums ;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int x=3 ;
        int k=4 ;
        List<Integer>num= findClosestElements(arr, k, x) ;
        System.out.println(num);
    }
}
