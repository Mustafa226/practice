import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        FrogJmp frogJmp = new FrogJmp();
        Assert.assertEquals(3, frogJmp.solution(10, 85, 30));
    }
}