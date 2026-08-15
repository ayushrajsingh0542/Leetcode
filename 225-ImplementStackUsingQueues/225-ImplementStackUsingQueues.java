// Last updated: 15/08/2026, 20:04:09
import java.util.*;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        int top = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) break;
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) break;
                q1.add(top);
            }
        }
        return top;
    }

    public int top() {
        if (empty()) {
            return -1;
        }
        int peek = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                peek = q1.remove();
                q2.add(peek);
            }
        } else {
            while (!q2.isEmpty()) {
                peek = q2.remove();
                q1.add(peek);
            }
        }
        return peek;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
