package Data_Structure_And_Algorithm;


public class Insertion_Sort {
    static void insertionSort(int[]arr){
         int n= arr.length ;
         for(int i=1; i<n; i++ ){
               int j= i ;

               while( j>0 && arr[j] < arr[j-1]){
                    // Swap a[j], a[j-1]
                   int temp= arr[j] ;
                   arr[ j] = arr[j-1];
                   arr[j-1] = temp ;
                   j-- ;

               }
         }
    }

    public static void main(String[] args) {

        int []arr= {8,5,6,7,2,3,1,9,45,1};

        insertionSort(arr) ;
        for(int val: arr){
            System.out.print(val +", " );
        }

    }
}
