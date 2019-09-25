import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class Stack_1_1_Test {
    @Before
    public void onStart() {
        stack = new Stack_1_1();
    }

    private Stack_1_1 stack;

    @Test
    public void testGetMin() {
        stack.push(-1);
        stack.push(-3);
        for (int i = 0; i < 1000; i++) {
            int random = -1;
            while (random < 1) {
                random = new Random().nextInt();
            }
            stack.push(random);
        }
        for (int i = 0; i < 100; i++) {
            stack.pop();
        }
        stack.push(-5);
        stack.push(-2);

        Assert.assertEquals(-5, stack.getMin());
    }

    @Test
    public void testPop() {
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 1000; i++) {
            Assert.assertEquals(stack.pop(), 999-i);
        }
    }
}
