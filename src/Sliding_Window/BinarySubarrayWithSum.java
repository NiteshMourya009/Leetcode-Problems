package Sliding_Window;

public class BinarySubarrayWithSum {
    public static int countSub(int[]nums, int goal){
        int n=nums.length ;
        if(goal < 0){
            return 0 ;
        }
        int l=0 ;
        int r =0 ;
        int sum=0 ;
        int count=0 ;
        while(r<n){
            sum+= nums[r] ;

            while(sum > goal){
                sum -= nums[l];
                l++ ;
            }
            count = count + (r-l+1) ;
            r++ ;
        }
        return count ;
    }
    public static void main(String[] args) {
        int[]nums={1,0,1,0,1} ;
        int goal= 2 ;
        int sub= countSub(nums, goal) - countSub(nums, goal-1) ;
        System.out.println(sub);
    }
}
