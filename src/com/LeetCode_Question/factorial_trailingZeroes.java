package com.LeetCode_Question;

public  class factorial_trailingZeroes {
    public static int factorialtrailingZeroes(int n){
        if(n==0) {
            return 0;
        }
        int fact = 1;
        for(int i = 1;i<=n;i++) {
            fact *= i;

        }
        System.out.println(fact);
        int count = 0;
        while(fact>0) {
            int zero = fact % 10;
            if (zero == 0) {
                count++;
            } else if (zero > 0) {
                break;
            }
            fact /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(factorialtrailingZeroes(n));
    }
}
