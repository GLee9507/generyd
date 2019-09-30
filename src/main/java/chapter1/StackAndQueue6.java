package chapter1;

import java.util.Stack;

/**
 * p 13
 * <p>
 * 用栈来解汉诺塔问题
 * <p>
 * 现限制不能从最左侧直接移动到最右侧，也不能从最右侧直接移动到最左侧
 * 而是必须经过中间。求当塔有 N 层的时候，打印最优移动过程和最优移动总步数。
 */
class Hannoi {
    private Stack<Integer> lef = new Stack<>(), mid = new Stack<>(), rig = new Stack<>();

    {
//        lef.push(5);
//        lef.push(4);
        lef.push(3);
        lef.push(2);
        lef.push(1);
    }

    /**
     *一
     * 1    x   x
     * 2    x   x
     * 3    x   x
     *
     *二
     * x    x   x
     * 2    x   x
     * 3    1   x
     *
     *三
     * x    x   x
     * x    x   x
     * 3    1   2
     *
     *四
     * x    x   x
     * x    x   1
     * 3    x   2
     *
     *五
     * x    x   x
     * x    x   1
     * x    3   2
     *
     *六
     * x    x   x
     * x    1   x
     * x    3   2
     *
     *七
     * x    x   x
     * x    1   x
     * 2    3   x
     *
     *八
     * x    x   x
     * 1    x   x
     * 2    3   x
     *
     *九
     * x    x   x
     * 1    x   x
     * 2    x   3
     *
     *十
     * x    x   x
     * x    x   x
     * 2    1   3
     *
     *十一
     * x    x   x
     * x    x   2
     * x    1   3
     *
     *十二
     * x    x   1
     * x    x   2
     * x    x   3
     */
    public void start() {

    }
}
