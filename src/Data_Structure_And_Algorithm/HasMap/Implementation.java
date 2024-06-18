package Data_Structure_And_Algorithm.HasMap;

import java.util.LinkedList;
import java.util.List;

public class Implementation {

    static  class MyHAshMAp<K, V>{
        public static final int DEFAULT_CAPACITY= 4 ;
        public  static final float DEFAULT_LOAD_FACTOR = 0.75f ;
        private class Node{
            K key ;
            V value ;

            Node(K key, V value){
                this.key= key ;
                this.value= value ;
            }
        }
        private int n ; // the number of the Entries in map
        private LinkedList<Node>[]buckets ;

        private void initBuckets(int N){  // N- Capacity/sizee of buckets array
            buckets= new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i]= new LinkedList<>() ;
            }
        }
        // traverses the l1 and looks for a node with key, if found it return it's index otherwise it return null
        private int searchInBuckets(LinkedList<Node> l1, K key){
             for(int i=0; i< l1.size(); i++) {
                 if (l1.get(i).key == key){

                     return i;
                 }
             }
             return -1 ;
        }
        public MyHAshMAp(){  // Constructor
            initBuckets(DEFAULT_CAPACITY);
        }
        private int HashFunc(K key){
            int hc = key.hashCode() ;
            return Math.abs(hc) % buckets.length ;
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets= buckets ;
            initBuckets(oldBuckets.length * 2);
            n= 0;
            for(var bucket : oldBuckets){
                for(var node: bucket){
                    put(node.key, node.value);
                }
            }
        }

        public int size(){ // Return number of entries im map
            return n ;
        }
        public void put(K key, V value){ // insert value or Updating the value
             int bi= HashFunc(key);
             LinkedList<Node>currBucket= buckets[bi];
             int ei= searchInBuckets(currBucket, key);
             if(ei == -1){  // key doen't exist we have to insert a new node
                 Node node=  new Node(key, value);
                 currBucket.add(node);
                 n++ ;
             }
             else { // Update CASE
                 Node currNode= currBucket.get(ei);
                 currNode.value= value ;
             }
             if(n>= buckets.length * DEFAULT_LOAD_FACTOR){
                  rehash() ;
            }
        }
        public V get (K key){
              int bi = HashFunc(key) ;
              LinkedList<Node> currBucket= buckets[bi];
              int ei= searchInBuckets(currBucket, key) ;
              if(ei != -1){
                  Node currNode = currBucket.get(ei) ;
                  return currNode.value ;
              }
                  return null ;
        }
        public V remove(K key){
            int  bi= HashFunc(key) ;
            LinkedList<Node> currBucket= buckets[bi] ;
            int ei = searchInBuckets(currBucket, key) ;
            if(ei != -1){  // key exists
                Node currNode= currBucket.get(ei) ;
                V val = currNode.value ;
                currBucket.remove(ei) ;
                n-- ;
                return  val ;
            }
            // key does not exist
            return null ;
        }



    }

    public static void main(String[] args){
        MyHAshMAp<String, Integer> mp= new MyHAshMAp<>();

        mp.put("a",1);
        mp.put("c",2);
        mp.put("d",3);
        mp.put("b",4);

        System.out.println("Testing size: "+ mp.size());

        mp.put("d",30);
        System.out.println("Testing size: "+ mp.size());

        // Testing get
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));

        System.out.println(mp.remove("b"));

    }
}
