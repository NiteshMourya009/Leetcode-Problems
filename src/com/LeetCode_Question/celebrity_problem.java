package com.LeetCode_Question;

import java.util.Stack;

public class celebrity_problem {
    //Function to find if there is a celebrity in the party or not.
    public static int celebrity(int[][]M, int n){
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1= st.pop();
            int v2= st.pop();
            if(M[v1][v2]==0){ // shayad v1 celeb ho sakta hai , v2 to celebrity nahi hai
               st.push(v1);
            }
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1 ;
        int potential= st.pop() ;
        for(int j=0; j<n; j++){
            if(M[potential][j]==1){
                return -1 ;
            }
        }
        for(int i=0; i<n; i++){
            if(i==potential) continue;
            if(M[i][potential]==0) return -1 ;
        }
        return potential ;
    }
    public static void main(String[] args) {

        // Not Understand problem properly
        int[][]arr= {{0,1,0},{0,0,0},{0,1,0}};
        int n= 3;
        System.out.println(celebrity(arr,n));
    }
}
