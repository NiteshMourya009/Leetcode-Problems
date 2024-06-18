package Data_Structure_And_Algorithm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner ;
public class Two_Sum {

    public static  int[] Result(int nums[], int target){

        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ){
            if(map.containsKey(target-nums[i])){
                int[] ints = {map.get(target - nums[i]), i};
                return ints;
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int target= sc.nextInt();

        int[] arr= Result(nums, target) ;
        for(int i=0 ; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
