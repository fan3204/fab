package f.a.b;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack stack = new ArrayStack(10);

    @Test
    public void push() {
        boolean result = stack.push("a");
        Assert.assertTrue(result);
    }

}