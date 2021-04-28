package com.easy.tournament_winner;

import java.util.*;

public class TournamentWinner {
    public static void main(String[] args) {
        List<List<String>> competitions = new ArrayList<>(Arrays.asList(
                Arrays.asList("HTML", "Java"),
                Arrays.asList("Java", "Python"),
                Arrays.asList("Python", "HTML"),
                Arrays.asList("C#", "Python"),
                Arrays.asList("Java", "C#"),
                Arrays.asList("C#", "HTML")
        ));
        List<Integer> results1 = new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1));
        System.out.println(tournamentWinner(competitions, results1));
        // Output: C#


        List<Integer> results2 = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 0));
        System.out.println(tournamentWinner(competitions, results2));
        // Output: Python



    }
    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<competitions.size(); i++){
            if(results.get(i) == 0){
                map.put(competitions.get(i).get(1), map.getOrDefault(competitions.get(i).get(1), 3) + 3);
            } else {
                map.put(competitions.get(i).get(0), map.getOrDefault(competitions.get(i).get(0), 3) + 3);
            }
        }
        String result = "";
        int maxResult = 0;
        for(Map.Entry<String, Integer> element : map.entrySet()){
            if(element.getValue() > maxResult){
                maxResult = element.getValue();
                result = element.getKey();
            }
        }
        return result;
    }
}
