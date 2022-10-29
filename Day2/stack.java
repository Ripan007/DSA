package Day2;

import java.util.Stack;

// first in last out
// last in first out
// plate are stack upon each other
// push =>insert
// pop => remove
// time complexity constant(insertion/remove)
// inbuilt stack implementation
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
