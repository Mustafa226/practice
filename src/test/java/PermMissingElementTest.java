import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermMissingElementTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        PermMissingElement permMissingElement = new PermMissingElement();
        Assert.assertEquals(4, permMissingElement.solution(new int[]{2, 3, 1, 5}));
    }
}