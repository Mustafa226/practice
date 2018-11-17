import org.junit.Assert;

public class MissingIntegerTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void solution() {
        MissingInteger missingInteger = new MissingInteger();
        Assert.assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
        Assert.assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
        Assert.assertEquals(1, missingInteger.solution(new int[]{-1, -3}));
    }
}