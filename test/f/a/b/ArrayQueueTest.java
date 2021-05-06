package f.a.b;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayQueueTest {

    private static final int LENGHT = 10;

    private static ArrayQueue queue = null;

    @BeforeClass
    public static void init() {
        queue = new ArrayQueue(LENGHT);
    }

    @Test
    public void a_enqueue() {

        boolean result = false;
        for (int i = 0; i < LENGHT + 1; i++) {
            result = queue.enqueue("a");
            System.out.println(queue);
        }

        Assert.assertFalse(result);
    }

    @Test
    public void b_dequeue() {
        String result = "";
        for (int i = 0; i < LENGHT + 1; i++) {
            result = queue.dequeue();
            System.out.println(queue);
        }
        Assert.assertNull(result);
    }
}