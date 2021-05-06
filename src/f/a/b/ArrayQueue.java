package f.a.b;

import java.util.Arrays;

/**
 * 基于数组实现队列
 * 在用数组实现的非循环队列中，队满的判断条件是 tail == length，队空的判断条件是 head == tail
 */
public class ArrayQueue {

    private String[] queue;

    private int length;

    private int head = 0;

    private int tail = 0;

    public ArrayQueue(int length) {
        this.length = length;
        queue = new String[length];
    }

    /**
     * 只入队列，不做数据搬移
     */
//    public boolean enqueue(String element) {
//        if (tail == length)
//            return false;
//
//        queue[tail] = element;
//        tail++;
//        return true;
//    }

    /**
     * 如果没有空闲空间了，需要在入队时，集中触发一次数据的搬移操作
     * @param element 元素
     * @return 返回成功与否
     */
    public boolean enqueue(String element) {
        if (tail == length) {
            if (head == 0) {
                return false;
            }
            else {
                // 数据搬移
                for (int i = head; i < tail; i++) {
                    queue[i - head] = queue[i];
                }

                head = 0;
                tail -= head;
            }

        }
        queue[tail] = element;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail)
            return null;
        String tmp = queue[head];
        head++;
        return tmp;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", length=" + length +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
