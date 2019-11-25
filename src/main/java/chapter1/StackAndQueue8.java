package chapter1;

import java.util.Stack;

/**
 * 给定一个不含有重复值的数组 arr，找到没一个 i 位置左边和右边离 i 位置最近且值比 arr[i] 小的位置。返回所有位置相应的信息
 * <p>
 * O(N) 单调栈结构实现
 */
class MonotoneStack {
    public static int[][] rightWay(int[] arr) {
        int[][] result = new int[arr.length][2];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                Integer peek = stack.peek();

                while (arr[stack.peek()] < arr[i]) {
                    stack.peek();
                }

                if (arr[peek] < arr[i]) {

                } else {
                    stack.push(i);
                }
                while ()
            }
        }
        return result;
    }
}
