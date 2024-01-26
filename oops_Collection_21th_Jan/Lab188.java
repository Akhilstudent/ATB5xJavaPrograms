package oops_Collection_21th_Jan;

import java.util.Stack;

public class Lab188 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
