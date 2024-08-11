package com.LeetCode_Question;

import java.util.List;

public class snakeInMAtrix {
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int x =0 ;
        int y=0 ;
        for (String command : commands) {
            switch (command) {
                case "DOWN":
                    if (x < n - 1) {
                        x++;
                    }
                    break;
                case "UP":
                    if (x > 0) {
                        x--;
                    }
                    break;
                case "RIGHT":
                    if (y < n - 1) {
                        y++;
                    }
                    break;
                case "LEFT":
                    if (y > 0) {
                        y--;
                    }
                    break;
            }
        }

        return x * n + y;
    }
    public static void main(String[] args) {
        int n=3 ;
        List<String> arr= List.of("RIGHT","DOWN") ;
        System.out.println(finalPositionOfSnake(n,arr));
    }
}
