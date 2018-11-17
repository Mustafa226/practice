import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeaderSortedTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        LeaderSorted leaderSorted = new LeaderSorted();
        Assert.assertEquals(-1, leaderSorted.solution(new int[]{2, 2, 2, 2, 2, 3, 4, 4, 4, 6}));
        Assert.assertEquals(1, leaderSorted.solution(new int[]{1, 1, 1, 1, 50}));

    }
}