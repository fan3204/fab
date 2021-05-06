package f.a.b.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSearchFGETest {

    @Test
    public void searchFG() {
        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchFGE search = new BSearchFGE();
        int index = search.search(a, 6, 4);
        Assert.assertEquals(3, index);
    }

    @Test
    public void searchFE() {
        int a[] = {1, 2, 2, 5, 9, 10};

        BSearchFGE search = new BSearchFGE();
        int index = search.search(a, 6, 5);
        Assert.assertEquals(3, index);
    }
}