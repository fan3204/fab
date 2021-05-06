package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSearchFETest {

    @Test
    public void searchFE() {

        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchFE search = new BSearchFE();
        int index = search.search(a, 6, 2);
        Assert.assertEquals(1, index);

    }
}