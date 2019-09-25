package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.RandomUtil;

import java.util.Random;

public class StackAndQueue1_Test {
    @Before
    public void onStart() {
        stack = new StackForMin();
    }

    private StackForMin stack;

    @Test
    public void testGetMin() {
        stack.push(-4);
        for (int i = 0; i < 1000; i++) {

            stack.push(RandomUtil.nextInt(-3, 123123123));
        }
        for (int i = 0; i < 100; i++) {
            stack.pop();
        }

        Assert.assertEquals(-4, stack.getMin());
    }

    @Test
    public void testPushAndPop() {
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 1000; i++) {
            Assert.assertEquals(stack.pop(), 999 - i);
        }
    }
}
