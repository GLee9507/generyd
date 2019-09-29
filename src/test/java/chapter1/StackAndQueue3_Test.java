package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class StackAndQueue3_Test {
    private Stack<Integer> stack;

    @Before
    public void onStart() {
        stack = new Stack<>();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
    }

    @Test
    public void testInvertStack() {
        InvertStack.invertStack(stack);


        for (int i = 0; i < stack.size(); i++) {
            Assert.assertEquals(stack.pop().intValue(), i);
        }

        InvertStack.invertStack(stack);
        for (int i = 0; i < stack.size(); i++) {
            Assert.assertEquals(stack.pop().intValue(), 99 - i);
        }
    }


}
