package lecture.stack_and_queue;


import java.util.Stack;

public class SpecialStack extends Stack {
    Stack<Integer> helperMin = new Stack<>();

    public void push(int x) {
        if (super.isEmpty()) {
            super.push(x);
            helperMin.push(x);
        } else {
            super.push(x);
            int min = helperMin.peek();
            if (x < min) {
                helperMin.push(x);
            } else {
                helperMin.push(min);
            }
        }
    }

    public Integer pop() {
        int x = (int) super.pop();
        helperMin.pop();
        return x;
    }

    public int getMin() {
        return helperMin.peek();
    }
}
