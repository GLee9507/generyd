package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.Stack;

public class StackAndQueue5_Test {
    private Stack<Integer> stack;

    @Before
    public void onStart() {
        stack = new Stack<>();
        for (int i = 0; i < 100; i++) {
            stack.push(new Random().nextInt(100));
        }
    }


    @Test
    public void testSort() {
        SortStack.sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
