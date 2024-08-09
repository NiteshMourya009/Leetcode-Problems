package Data_Structure_And_Algorithm.Priority_Queue;
import java.util.* ;
class Nodes{
    int key ;
    int value ;

    Nodes(int key, int value){
        this.key= key;
        this.value= value ;
    }
}
public class ReduceArraySizeToHalf {
    public static int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>() ;
        for(int num: arr){
            if(!map.containsKey(num)){
                map.put(num, 1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        PriorityQueue<Nodes>pq= new PriorityQueue<>((a,b) ->( b.value- a.value)) ;

        for(var num: map.entrySet()){
            pq.add(new Nodes(num.getKey(), num.getValue())) ;
        }
        int size= arr.length/2 ;
        int sum= 0 ;
        int count=0 ;
        while(sum<= size){
            sum += pq.peek().value  ;
            count++ ;
            if(sum>=size){
                return count ;
            }
            pq.poll() ;
        }
        return count ;

    }
    public static void main(String[] args) {
        int[]arr= {3,3,3,3,5,5,5,2,2,7} ;
        System.out.println(minSetSize(arr));
    }
}
