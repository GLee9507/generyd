package chapter1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * p 18 生成窗口最大值数组
 */
class SlidingWindowMaximum {
    /**
     * 核心思想：保证队列中可取到每一次遍历的最大值，并且为后续的遍历保存第二大值
     *
     * @param arr 数组
     * @param ws  windowSize 窗口长度
     * @return 每一种窗口最大值数组
     */
    @SuppressWarnings("all")
    public static int[] getMaxArray(int[] arr, int ws) {
        int[] result = new int[arr.length - ws + 1];
        int index = 0;
        Deque<Integer> maxDeque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {

            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] < arr[i]) {
                maxDeque.pollLast();
            }

            maxDeque.addLast(i);


            if (maxDeque.peekFirst() == i - ws) {
                maxDeque.pollFirst();
            }

            if (i >= ws - 1) {
                result[index++] = arr[maxDeque.peekFirst()];
            }
        }
        return result;
    }


}
