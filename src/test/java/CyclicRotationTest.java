import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        CyclicRotation cyclicRotation = new CyclicRotation();

        Assert.assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        Assert.assertArrayEquals(new int[]{0, 0, 0}, cyclicRotation.solution(new int[]{0, 0, 0}, 1));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));

    }
}