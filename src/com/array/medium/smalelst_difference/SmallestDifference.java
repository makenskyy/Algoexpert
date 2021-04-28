package com.array.medium.smalelst_difference;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestDifference(
                        new int[]{-1, 5, 10, 20, 28, 3},
                        new int[]{26, 134, 135, 15, 17}
                        )));
        // Output: [28, 26]
        System.out.println(Arrays.toString(smallestDifference(
                new int[]{-1, 5, 10, 20, 3},
                new int[]{26, 134, 135, 15, 17}
        )));
        // Output: [20, 17]
    }
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int numOne = -1;
        int numTwo = -1;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i<arrayOne.length; i++){
            for(int j = 0; j<arrayTwo.length; j++){
                if(Math.abs(arrayOne[i] - arrayTwo[j]) < minDiff){
                    minDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
                    numOne = arrayOne[i];
                    numTwo = arrayTwo[j];
                }
            }
        }
        return new int[] {numOne, numTwo};
    }
}
