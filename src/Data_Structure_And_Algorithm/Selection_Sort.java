package Data_Structure_And_Algorithm;



public class Selection_Sort {
    static void SelectionSort(int[]arr){
        int n= arr.length ;

        for(int i=0; i<n-1; i++){   // i represent the current index
            // find the minimum element in unsorted part of arry

            int min_index = i;
            for(int j=i+1; j<n;  j++){
                if(arr[j] < arr[min_index]){
                    min_index= j ;
                }
            }
            // Swap current element and minimum element

            int temp= arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= temp ;

        }

    }
    public static void main(String[] args) {

        int[ ]arr= {7,6,8,4,7,9,1,3,2};
        SelectionSort(arr);

        System.out.println("Array After Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }


    }
}
