package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

public class RecursionBSearchETest {

    @Test
    public void searchE() {
        int a[] = {1, 2, 4, 5, 9, 10};

        ReBSearchE search = new ReBSearchE();
        int index = search.search(a, 6, 2);
        Assert.assertEquals(1, index);
    }
}