package Data_Structure_And_Algorithm;

// Quick Sort is divide and Conquer method
// 1. choose the pivot index and place it its proper index
// 2. pivot

public class Quick_Sort {

    static void  displayArr(int[]arr) {
        for (int val : arr) {
            System.out.print(val +", ");
        }
    }
    static void swap (int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[]arr, int st, int end){

        int pivot= arr[st];
        int count= 0 ;

        for(int i= st+1; i<=end ; i++){
            if(arr[i]<= pivot)
                count++ ;
        }
        int pivotIdx= st+ count ;
        swap(arr, st, pivotIdx);

        int i= st, j=end ;

        // elements lesser or equal left of pivotIdx , greater element right side if the pivot
        while(i<pivotIdx && j>pivotIdx){

            while(arr[i]<= pivot) i++ ;
            while(arr[j]> pivot) j-- ;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++ ;
                j-- ;
            }
        }
        return pivotIdx ;
    }

    static  void QuickSort(int[]arr, int st, int end){

        if(st >= end) return ;
        int pi= partition(arr, st, end);
        QuickSort(arr, st, pi-1);
        QuickSort(arr, pi+1, end);
    }
     public static void main(String[] args) {

        int[]arr= {6,3,1,5,4,8,2};
        System.out.println("Array Before Sorting");
        displayArr(arr);
        System.out.println();
         QuickSort(arr, 0, arr.length-1);
        System.out.println("Array after Sorting:");
        displayArr(arr);

    }
}



