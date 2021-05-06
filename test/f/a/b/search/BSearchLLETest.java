package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSearchLLETest {

    @Test
    public void searchLE() {
        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchLLE search = new BSearchLLE();
        int index = search.search(a, 6, 5);
        Assert.assertEquals(3, index);
    }

    @Test
    public void searchLL() {
        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchLLE search = new BSearchLLE();
        int index = search.search(a, 6, 6);
        Assert.assertEquals(3, index);
    }
}