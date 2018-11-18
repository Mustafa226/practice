import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        StringReverse stringReverse = new StringReverse();
        Assert.assertEquals("dlroWolleH", stringReverse.solution("HelloWorld"));

    }
}