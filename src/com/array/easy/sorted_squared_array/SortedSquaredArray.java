package com.array.easy.sorted_squared_array;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{1, 2, 3, 4, 5, 6, 8, 9})));
        // Output : [1, 4, 9, 16, 25, 36, 64, 81]
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-10, -5, 0, 5, 10})));
        // Output : [0, 25, 25, 100, 100]


    }
    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        int pos_start = 0;
        while(array[pos_start] < 0){
            pos_start++;
        }
        int right = pos_start, left = pos_start - 1;
        while (right < array.length && left >= 0){
            if(array[right] > Math.abs(array[left])){
                result[index] = array[left] * array[left];
                left--;
            } else {
                result[index] = array[right] * array[right];
                right++;
            }
            index++;
        }
        for(int i = left; i >= 0; i--){
            result[index] = array[i] * array[i];
            index++;
        }
        for(int i = right; i < array.length; i++){
            result[index] = array[i] * array[i];
            index++;
        }
        return result;
    }
}
