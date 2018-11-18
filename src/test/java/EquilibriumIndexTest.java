import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquilibriumIndexTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solve() {
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        Assert.assertEquals(1, equilibriumIndex.solve(new int[]{-1, 3, -4, 5, 1, -6, 2, 1}, 8));
    }
}