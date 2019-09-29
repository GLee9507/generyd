package chapter1;


import com.sun.tools.javac.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

class Pet {
    final String type;

    Pet(String type) {
        this.type = type;
    }
}

class Dog extends Pet {
    Dog() {
        super("dog");
    }
}

class Cat extends Pet {
    Cat() {
        super("cat");
    }
}

class CatDogQueue {
    private Queue<Pair<Dog, Long>> dogQueue = new LinkedList<>();
    private Queue<Pair<Cat, Long>> catQueue = new LinkedList<>();
    private long mod;

    public void add(Pet pet) {
        if (pet instanceof Dog) {
            dogQueue.add(Pair.of((Dog) pet, mod++));
        } else if (pet instanceof Cat) {
            catQueue.add(Pair.of((Cat) pet, mod++));
        }
    }

    public int size() {
        return dogQueue.size() + catQueue.size();
    }

    public Pet pollAll() {
        Pair<Dog, Long> dogPair = dogQueue.peek();
        Pair<Cat, Long> catPair = catQueue.peek();
        long dogMod = dogPair == null ? Long.MAX_VALUE : dogPair.snd;
        long catMod = catPair == null ? Long.MAX_VALUE : catPair.snd;

        if (dogMod > catMod) {
            Pair<Cat, Long> pair = catQueue.poll();
            return pair == null ? null : pair.fst;
        } else if (dogMod < catMod) {
            Pair<Dog, Long> pair = dogQueue.poll();
            return pair == null ? null : pair.fst;
        } else {
            return null;
        }
    }

    public Dog pollDog() {
        Pair<Dog, Long> dogLongPair = dogQueue.poll();
        return dogLongPair == null ? null : dogLongPair.fst;
    }

    public Cat pollCat() {
        Pair<Cat, Long> catLongPair = catQueue.poll();
        return catLongPair == null ? null : catLongPair.fst;
    }

    public boolean isEmpty() {
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }
}