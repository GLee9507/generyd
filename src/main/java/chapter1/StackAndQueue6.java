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
    //TODO
    private Stack<Integer> lef = new Stack<>(), mid = new Stack<>(), rig = new Stack<>();

    {
//        lef.push(5);
//        lef.push(4);
        lef.push(3);
        lef.push(2);
        lef.push(1);
    }

    public void start() {
        
    }
}
