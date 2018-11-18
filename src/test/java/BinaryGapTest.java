import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        BinaryGap binaryGap = new BinaryGap();
        Assert.assertEquals(2, binaryGap.solution(9));
        Assert.assertEquals(4, binaryGap.solution(529));
        Assert.assertEquals(1, binaryGap.solution(20));
        Assert.assertEquals(0, binaryGap.solution(15));
        Assert.assertEquals(0, binaryGap.solution(32));
        Assert.assertEquals(5, binaryGap.solution(1041));

    }
}