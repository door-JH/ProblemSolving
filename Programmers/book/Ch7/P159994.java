package Programmers.book.Ch7;

import java.util.ArrayDeque;
import java.util.Arrays;

public class P159994 {

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        //cards와 goal을 deque로 변환
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));
        
        //goaldeque에 문자열이 남아 있으면 계속 반복
        while(!goalDeque.isEmpty()){
            if(!cardsDeque1.isEmpty() && 
                cardsDeque1.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }
            else if(!cardsDeque2.isEmpty() && 
                    cardsDeque2.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }
            else {
                break;
            }
        }
        return goalDeque.isEmpty() ? "Yes" : "No";
    }
    
    public static void main(String[] args) {
        
    }
}
