package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.Random;

public class StackAndQueue2_Test {
    @Before
    public void onStart() {
        queue = new QueueByStack<>();
    }

    private QueueByStack<Integer> queue;

    @Test
    public void testAddAndPoll() {
        for (int i = 0; i < 1000; i++) {
            queue.add(i);
        }

        for (int i = 0; i < 1000; i++) {
            Integer poll = queue.poll();
            int v = poll == null ? 0 : poll;
            Assert.assertEquals(v, i);
        }
    }

    @Test
    public void testAddAndPeek() {

        for (int i = 0; i < 1000; i++) {
            queue.add(i);
        }

        for (int i = 0; i < 1000; i++) {
            Integer poll = queue.poll();
            int v = poll == null ? 0 : poll;
            Assert.assertEquals(v, i);
        }
    }
}
