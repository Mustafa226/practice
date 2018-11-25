import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        Assert.assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
    }
}