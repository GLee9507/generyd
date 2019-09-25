package chapter1;

import java.util.Stack;

/**
 * p 1
 * 实现一个特殊的栈，在实现栈基本功能的基础上，实现返回最小值的操作
 */
class StackForMin {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    /**
     * 核心思想：
     * - 维护两个栈
     * - 栈 A 是存放数据的栈
     * - 栈 B 是记录每次栈变化后的最小值
     *
     * @param value 入栈数据
     */
    public void push(int value) {
        stack.push(value);

        if (!minStack.isEmpty() && minStack.peek() < value) {
            value = minStack.peek();
        }

        minStack.push(value);
    }

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }

}