package com.array.easy.two_number_sum;

import java.util.HashMap;

public class TwoNumberSum {
    public static void main(String[] args) {
        int count = 0;

        // Test 1
            int[] test1 = twoNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 12);
            if(test1[0] == 3 && test1[1] == 9) count++;
            else System.out.println("There is a problem on your first test");
        // Test 2
            try{
                int[] test2 = twoNumberSum(new int[]{6}, 12);
            } catch (IllegalArgumentException e){
                count++;
            }
        System.out.println(count);
    }
    public static int[] twoNumberSum(int[] array, int targetSum){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<array.length; i++){
            map.put(array[i], i);
        }
        for(int i = 0; i<array.length; i++){
            if(map.containsKey(targetSum - array[i]) && map.get(targetSum - array[i]) != i){
                return new int[] {array[i], targetSum-array[i]};
            }
        }
        throw new IllegalArgumentException("You do not have two numbers in your that sum is equal " + targetSum);
    }

}
