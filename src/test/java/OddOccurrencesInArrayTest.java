import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        Assert.assertEquals(7, oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
        Assert.assertEquals(1, oddOccurrencesInArray.solution(new int[]{1}));
    }
}