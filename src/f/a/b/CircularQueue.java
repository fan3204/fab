package f.a.b;

public class CircularQueue {
    private String[] queue;

    private int length;

    private int head = 0;

    private int tail = 0;

    public CircularQueue(int length) {
        this.length = length;
        queue = new String[length];
    }

    public boolean enqueue(String element) {
        if ((tail + 1) % length == head)
            return false;

        queue[tail] = element;
        tail = (tail + 1) % length;
        return true;
    }

    public String dequeue() {
        if (head == tail)
            return null;
        String tmp = queue[head];
        head = (head + 1) % length;
        return tmp;
    }
}
