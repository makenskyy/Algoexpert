package com.array.medium.three_number_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0));
        // Output: [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
        System.out.println(threeNumberSum(new int[]{8, 10, -2, 49, 14}, 57));
        // Output: [[-2, 10, 49]]
        System.out.println(threeNumberSum(new int[]{1, 2, 3}, 29));
        // Output: []
    }
    public static List<List<Integer>> threeNumberSum(int[] array, int targetSum) {
        List<List<Integer>> output_arr = new ArrayList<>();
        Arrays.sort(array);
        int i = 0;
        while(i < array.length){
            int left = i + 1, right = array.length - 1;
            while(left < right){
                int sum = array[i] + array[left] + array[right];
                if(sum < targetSum) left++;
                else if(sum > targetSum) right--;
                else{
                    output_arr.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                }
            }
            i++;
        }
        return output_arr;
    }
}
