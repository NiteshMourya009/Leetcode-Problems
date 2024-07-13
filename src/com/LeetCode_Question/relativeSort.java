package com.LeetCode_Question;
import java.util.* ;
public class relativeSort {
    public static  int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1) ;
        HashMap<Integer,Integer> map =new HashMap<>() ;
        int[]arr =new int[arr1.length] ;
        for(int num:arr1){
            if(!map.containsKey(num)){
                map.put(num,1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        int k= 0 ;
        for(int i=0; i<arr2.length ; i++){
            if(map.containsKey(arr2[i])){
                int freq = map.get(arr2[i]) ;
                while(freq != 0){
                    arr[k++] =arr2[i] ;
                    freq-- ;
                }
            }
        }
        ArrayList<Integer> nums= new ArrayList<>() ;
        HashMap<Integer,Integer> map1= new HashMap<>() ;
        for(int var:arr2){
            if(!map1.containsKey(var)){
                map1.put(var,1) ;
            }
            else{
                map1.put(var, map1.get(var)+1) ;
            }
        }
        for(int i=0; i<arr1.length; i++){
            if(!map1.containsKey(arr1[i])){
                nums.add(arr1[i]) ;
            }
        }
        int p =nums.size() ;
        for(int i=0; i<p; i++){
            arr[k++] = nums.get(i);
        }
        return arr ;

    }
    public static void main(String[] args) {
        int[]arr1= {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}  ;
        int[]arr2={2,42,38,0,43,21} ;
        int[]arr= relativeSortArray(arr1,arr2);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
