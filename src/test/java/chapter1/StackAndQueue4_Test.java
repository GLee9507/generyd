package chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class StackAndQueue4_Test {
    private CatDogQueue catDogQueue;

    @Before
    public void onStart() {
        catDogQueue = new CatDogQueue();
        boolean dogOrCat = false;
        for (int i = 0; i < 100; i++) {
            if (dogOrCat) {
                catDogQueue.add(new Dog());
            } else {
                catDogQueue.add(new Cat());
            }
            dogOrCat = !dogOrCat;
        }
    }


    @Test
    public void testPollAll() {
        boolean dogOrCat = false;
        for (int i = 0; i < 100; i++) {
            Pet pet = catDogQueue.pollAll();

            if (!dogOrCat) {
                Assert.assertTrue(pet instanceof Cat);
            } else {
                Assert.assertTrue(pet instanceof Dog);
            }
            dogOrCat = !dogOrCat;
        }
    }

    @Test
    public void testPollDog() {

        int i = 0;
        while (true) {
            Cat cat = catDogQueue.pollCat();
            if (cat == null) {
                break;
            }
            i++;
        }
        Assert.assertEquals(i, 50);
        Assert.assertTrue(catDogQueue.isCatEmpty());

    }

    @Test
    public void testPollCat() {

        int i = 0;
        while (true) {
            Dog dog = catDogQueue.pollDog();
            if (dog == null) {
                break;
            }
            i++;
        }
        Assert.assertEquals(i, 50);
        Assert.assertTrue(catDogQueue.isDogEmpty());
    }

    @Test
    public void testEmpty() {
        testPollCat();
        Assert.assertTrue(catDogQueue.isDogEmpty());
        testPollDog();
        Assert.assertTrue(catDogQueue.isCatEmpty());
        Assert.assertTrue(catDogQueue.isEmpty());
    }
}
