package chapter1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.Stack;

public class StackAndQueue7_Test {
    @Test
    public void test() {
//        int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
        int[] arr = {7,2,4};
        int[] maxArray = SlidingWindowMaximum.getMaxArray(arr, 2);
        for (int i : maxArray) {
        System.out.print(i+",");
        }

    }
}
