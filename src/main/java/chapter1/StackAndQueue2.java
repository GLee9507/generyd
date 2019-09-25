package chapter1;

import java.util.Stack;

/**
 * 使用两个栈实现队列，支持 add poll peek
 */
class QueueByStack<T> {
    private Stack<T> dataStack = new Stack<>();
    private Stack<T> bufferStack = new Stack<>();

    public void add(T t) {
        dataStack.push(t);
    }

    public T poll() {
        if (bufferStack.isEmpty()) {
            pourStack();
        }
        return bufferStack.pop();
    }

    private void pourStack() {
        int size = dataStack.size();
        for (int i = 0; i < size; i++) {
            bufferStack.push(dataStack.pop());
        }

    }

    public T peek() {
        if (bufferStack.isEmpty()) {
            pourStack();
        }
        return bufferStack.peek();
    }

}
