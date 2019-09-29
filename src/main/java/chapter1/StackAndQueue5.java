package chapter1;

import java.util.Stack;

/**
 * p 12
 * 用一个栈实现另一个栈的排序
 * 不允许使用其他数据结构
 * TODO: REVIEW
 *
 * 1. 定义辅助栈 helper ，原始栈中弹出一个元素作为 cur
 * 2. helper 为空或者 cur <= helper 栈顶元素，则将 cur 压入 helper
 * 3. 如果 cur > helper 栈顶元素，则依次将 helper 依次弹出元素压入原始栈，直到 cur <= helper 栈顶元素，最后将 cur 压入 helper
 * 4. 重复 2-3 步骤，直到原始栈为空
 * 5. 将 helper 元素倒入 原始栈中
 */
class SortStack {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> helper = new Stack<>();

        while (!stack.isEmpty()) {
            Integer cur = stack.pop();

            while (!helper.isEmpty() && helper.peek() < cur) {
                stack.push(helper.pop());
            }

            helper.push(cur);
        }

        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }
}
