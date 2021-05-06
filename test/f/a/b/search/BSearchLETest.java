package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSearchLETest {

    @Test
    public void search() {

        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchLE search = new BSearchLE();
        int index = search.search(a, 6, 2);
        Assert.assertEquals(2, index);
    }
}