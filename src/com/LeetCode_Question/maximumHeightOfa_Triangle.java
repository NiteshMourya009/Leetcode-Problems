package com.LeetCode_Question;
import java.util.* ;
public class maximumHeightOfa_Triangle {
    public static int Height(int blue, int red){
        int height = 0;
        boolean isRedRow = true;

        while (true) {
            height++;
            if (isRedRow) {
                if (red >= height) {
                    red -= height;
                    isRedRow = false;
                } else {
                    break;
                }
            } else {
                if (blue >= height) {
                    blue -= height;
                    isRedRow = true;
                } else {
                    break;
                }
            }
        }
        return height-1 ;
    }
    public static void main(String[] args) {
        int blue=4 ;
        int red= 2;
        System.out.println(Height(4,2));
    }
}
