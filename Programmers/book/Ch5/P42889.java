package Programmers.book.Ch5;
import java.util.HashMap;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        int[] challenger = new int[N + 2];
        for(int i = 0; i < stages.length; i++){
            challenger[stages[i]]++;
        }
        
        HashMap<Integer, Double> fails = new HashMap<>();
        int total = stages.length;
        
        for(int i = 1; i <= N; i++){
            if(challenger[i] == 0){
                fails.put(i, 0.0);
            } else {
                fails.put(i,(double) challenger[i] / total);
            }
            total -= challenger[i];
        }
        
        
        return fails
                .entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .mapToInt(HashMap.Entry::getKey)
                .toArray();
    }
}