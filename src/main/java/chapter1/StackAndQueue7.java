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
        //结果
        int[] result = new int[arr.length - ws + 1];
        //result 数组指针
        int index = 0;
        //双端队列
        Deque<Integer> maxDeque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            //保证本次队首为最大值
            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] < arr[i]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(i);

            //判断队首值是否在窗口内，不在窗口内则移除
            if (maxDeque.peekFirst() == i - ws) {
                maxDeque.pollFirst();
            }

            //满足窗口条件存入数组
            if (i >= ws - 1) {
                result[index++] = arr[maxDeque.peekFirst()];
            }

        }
        return result;
    }



}
