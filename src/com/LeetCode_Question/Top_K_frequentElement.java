package com.LeetCode_Question;
import java.util.* ;
public class Top_K_frequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>() ;

        for(int ar: nums){
            if(!map.containsKey(ar)){
                map.put(ar,1) ;
            }
            else{
                map.put(ar, map.get(ar)+1) ;
            }
        }
        ArrayList<Integer>arr= new ArrayList<>() ;

        for(var e:map.entrySet()){
            int max= e.getValue() ;
            if(max>=k){
                int min= e.getKey() ;
                arr.add(min) ;
            }
        }
        int[] nums1 =new int[k] ;
        for(int i=0; i<arr.size() ; i++){
            nums1[i]= arr.get(i) ;
        }
        Collections.sort(arr) ;
        int n = arr.size() ;
        for(var e: map.entrySet()){

        }
        return nums1 ;
    }
    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,2,3} ;
        int k=2 ;
        int [] arr= topKFrequent(nums, k) ;
        for(int i:arr){
            System.out.println(i) ;
        }
    }
}
