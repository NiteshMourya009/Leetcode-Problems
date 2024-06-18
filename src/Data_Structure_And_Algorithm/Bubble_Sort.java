package Data_Structure_And_Algorithm;
import java.util.Scanner ;


public class Bubble_Sort {

    static  void bubbleSort(int[] arr){
        int n = arr.length ;
        for(int i=0; i<n-1 ; i++){
            for(int j=0; j<n-i-1; j++){
                //(// so last i element is already at correct position no need to check them.

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp ;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt() ;
        int[]arr= new int[n];
        for(int i=0; i<n; i++ ){
            arr[i]=sc.nextInt() ;
        }
        bubbleSort(arr);
        for(int i: arr){
            System.out.println( i +", ");
        }

    }
}
