package com.easy.validate_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        // Test 1
            boolean test1 = isValidSubsequence(new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)), new ArrayList<>(Arrays.asList(1, 6, -1, 10)));
            System.out.println(test1);
        // Test 2
            boolean test2 = isValidSubsequence(new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)), new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)));
            System.out.println(test2);
        // Test 3
            boolean test3 = isValidSubsequence(new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)), new ArrayList<>(Arrays.asList(5, 1, 22, 6, -1, 8, 10)));
            System.out.println(test3);
        // Test 4
            boolean test4 = isValidSubsequence(new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)), new ArrayList<>(Arrays.asList(22, 25, 6)));
            System.out.println(test4);
        // Test 5
            boolean test5 = isValidSubsequence(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), new ArrayList<>(Arrays.asList(6, 7, 8, 9)));
            System.out.println(test5);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0, j = 0;
        while(i < array.size() && j<sequence.size()){
            if(array.get(i) == sequence.get(j)){
                j++;
            }
            i++;
        }
        return j == sequence.size();
    }
}
