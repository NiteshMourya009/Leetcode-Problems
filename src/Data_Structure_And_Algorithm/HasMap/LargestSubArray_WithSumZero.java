package Data_Structure_And_Algorithm.HasMap;

import java.util.HashMap;

public class LargestSubArray_WithSumZero {

    public static  int zeroSumLargestSubarray(int[]arr ,int n){
        HashMap<Integer, Integer> map= new HashMap<>() ;

        // prefixSum index
        int maxLen= 0 , prefSum= 0 ;
        map.put(0,-1) ;
        for(int i=0; i<arr.length; i++){
            prefSum = prefSum + arr[i] ;

            if( map.containsKey(prefSum)){
                maxLen= Math.max(maxLen, i-map.get(prefSum)) ;
            }
            else{
                map.put(prefSum,i) ;
            }
        }
        return maxLen ;
    }

    public static void main(String[] args) {

        int [] arr ={15,-2,2,-8,1,7,10,14};
        int n= 0 ;

        System.out.println(zeroSumLargestSubarray(arr,n));

    }
}
