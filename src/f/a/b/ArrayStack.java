package f.a.b;

/**
 * 基于数组实现栈
 */
public class ArrayStack {

    private String[] items;

    private int count;

    private  int length;

    public ArrayStack(int length) {
        this.length = length;
        this.items = new String[length];
        this.count = 0;
    }

    public boolean push(String item) {
        if (count >= length) return false;
        items[count] = item;
        count++;
        return true;
    }

    public String pop() {
        if (count <=0) return null;
        String temp = items[count - 1];
        items[count] = null;
        count--;
        return temp;
    }

}
