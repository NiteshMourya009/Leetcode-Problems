package com.LeetCode_Question;
import java.util.* ;
public class Four_Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length ;
        List<List<Integer>> result= new ArrayList<>() ;
        Set<List<Integer>> ans= new HashSet<>() ;
        //  int x=0 ;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int x=j+1 ;
                int y= nums.length-1 ;
                while(x<y){
                    long sum=(long)nums[i]+nums[j]+nums[x]+nums[y];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[x],nums[y]));
                        x++ ;
                        y-- ;
                    }
                    else if(sum> target){
                        y-- ;
                    }
                    else if(sum < target){
                        x++ ;
                    }
                }

            }
        }
        result.addAll(ans) ;
        return result ;
    }
    public static void main(String[] args) {
        int [] nums= {1,0,-1,0,-2,2} ;
        int target =0 ;
        fourSum(nums, target) ;
    }
}
