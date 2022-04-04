package calc.reken;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class MashTest {

    @Test
    public  void r() {
        Mash mash = new Mash();
        int expected = 15;
        int res = mash.rek(7, 8, 0);
        Assert.assertEquals(expected, res);
    }
}