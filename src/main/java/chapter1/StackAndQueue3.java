package chapter1;

import java.util.Stack;

/**
 * p 7
 * 仅使用递归函数和栈操作逆序一个栈，不能用其他数据结构
 */
@SuppressWarnings("unchecked")
class InvertStack {

    /**
     * 运用两个递归函数，使用函数栈替代栈的数据结构i
     * @param stack
     */
    public static void invertStack(Stack stack) {
        if (stack.isEmpty()) {
            return;
        }
        Object o = removeLast(stack);
        invertStack(stack);
        stack.push(o);
    }

    /**
     * 删除并且返回栈底元素
     *
     * @param stack 栈
     * @return 被删除的栈底元素
     */
    @SuppressWarnings("unchecked")
    private static Object removeLast(Stack stack) {
        Object pop = stack.pop();
        if (stack.isEmpty()) {
            return pop;
        } else {
            Object fun = removeLast(stack);
            stack.push(pop);
            return fun;
        }
    }
}
