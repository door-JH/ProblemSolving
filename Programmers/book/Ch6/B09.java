package Programmers.book.Ch6;

import java.util.Stack;

public class B09 {

    static void runTestCase(){
        int[] decimals = {10, 27, 12345};
        String[] answers = {"1010", "11011", "11000000111001"};
        
        for(int i = 0; i < decimals.length; i++){
            System.out.println((i + 1) +"번 테스트");
            if (solution(decimals[i]).equals(answers[i])) {
                System.out.println("통과");
            } else {
                System.out.println("실패");
            }
        }

    }


    static String solution(int decimal) {
        
        //10진수 N을 2로 나눈 나머지, 즉 %2 연산을 한 값을 저장하고, N은 2로 나눔
        //몫이 0이 아니라면 나머지를 버리고 다시 1을 수행
        //모든 과정이 끝나고 1에서 저장한 수를 뒤부터 순서대로 가져와 붙이기
        StringBuilder answer = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        
        while(decimal != 0){
            stack.push(decimal % 2);
            decimal /= 2;
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop().toString());
        }


        return answer.toString();
    }



    public static void main(String[] args) {
        runTestCase();
    }

}