package com.LeetCode_Question;
import java.util.*;
class Node{
    int value ;
    int freq ;
    Node(int value, int freq){
        this.value= value ;
        this.freq= freq ;
    }
}
class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map =new HashMap<>() ;
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        PriorityQueue<Node> pq= new PriorityQueue<>((a,b) -> (a.freq-b.freq)) ;
        for(var e:map.entrySet()){
            int a= e.getValue() ;
            int b= e.getKey() ;
            pq.add(new Node(a,b));
        }

        pq.poll();
        int f=pq.peek().freq;
        int v= pq.peek().value;
        System.out.println(f+" "+v);
        int i=0 ;
        int[]arr= new int[k] ;
        while(k>0){
            arr[i++]= pq.peek().freq ;
            pq.poll() ;
            k--;
        }
        return arr ;


    }

    public static void main(String[] args) {
        int [] nums={4,1,-1,2,-1,2,3};
        int [] result=topKFrequent(nums,2);
        for (int i=0;i<result.length;i++){
//            System.out.print(" "+result[i]);
        }
    }
}