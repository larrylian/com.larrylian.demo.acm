import java.util.Stack;

/**
 *
 * Created by Larry 09/09/2017
 */
class MinStack {
    private Stack<Integer> dataStack, minStack;
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty()) {
            minStack.push(node);
        } else {
            int min = minStack.peek();
            if (node < min) {
                minStack.push(node);
            }
        }
    }

    public void pop() {
        int data = dataStack.pop();
        int min = minStack.pop();
        if (min != data) {
            minStack.push(min);
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}