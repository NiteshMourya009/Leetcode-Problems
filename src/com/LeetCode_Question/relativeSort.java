package com.LeetCode_Question;
import java.util.* ;
public class relativeSort {
    public static  int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1) ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i=0; i<arr1.length; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], 1) ;
            }
            else{
                map.put(arr1[i],map.get(arr1[i])+1) ;
            }
        }
        int[]arr= new int[arr1.length] ;
        int k=0 ;
        int j=0 ;
        for(int i=0; i<arr2.length ; i++){
            if(map.containsKey(arr2[i])){
                int freq= map.get(arr2[i]) ;
                while(freq != 0){
                    arr[k++] =arr2[i] ;
                    freq-- ;
                }
                map.remove(arr2[i])  ;
            }

        }
        List<Integer> list= new ArrayList<>() ;
        for( var e : map.entrySet()){
            int fre= e.getValue() ;
            while(fre !=0 ) {
                list.add(e.getKey());
            }
        }
        Collections.sort(list) ;
        int p= 0 ;
        int n=list.size() ;
        while( n!=0){
            arr[k++] =list.get(p++);
            n-- ;
        }
        return arr ;
    }
    public static void main(String[] args) {
        int[]arr1= {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}  ;
        int[]arr2={2,42,38,0,43,21} ;
        System.out.println(relativeSortArray(arr1,arr2));
    }
}
