package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSearchETest {

    @Test
    public void searchE() {
        int a[] = {1, 2, 4, 5, 9, 10};

        BSearchE search = new BSearchE();
        int index = search.search(a, 6, 9);
        Assert.assertEquals(4, index);
    }
}