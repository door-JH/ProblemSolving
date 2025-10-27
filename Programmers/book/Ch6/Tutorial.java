package Programmers.book.Ch6;

import java.util.Stack;

public class Tutorial {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();   // 스택 객체 생성

        stack.push(1);
        stack.push(3);
        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        stack.push(6);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
