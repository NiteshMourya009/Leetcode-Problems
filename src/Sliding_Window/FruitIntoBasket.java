package Sliding_Window;
import java.util.* ;
public class FruitIntoBasket {
    public static int  totalFruit(int[] fruits, int k) {
         int l=0;
         int r=0;
         int maxlen=0 ;
         int n= fruits.length ;
         HashMap<Integer, Integer> map= new HashMap<>() ;
         while(r<n){
            if(!map.containsKey(fruits[r])){
                map.put(fruits[r],1);
            }
            else{
                map.put(fruits[r], map.get(fruits[r])+1) ;
            }
            if(map.size() > k){
                while(map.size() > k ){
                    map.put(fruits[l], map.get(fruits[l])-1) ;
                    if(map.get(fruits[l])==0){
                         map.remove(fruits[l]);
                    }
                    l++ ;
                }
            }
            if(map.size()<= k){
                maxlen= Math.max(maxlen, r-l+1) ;
            }
             r++ ;
         }
         return maxlen ;
    }
    public static void main(String[] args) {
        int[]arr={3,3,3,1,2,1,1,2,3,3,4} ;
        System.out.println(totalFruit(arr, 2));
    }
}
