import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DeveloperTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
    }

    @Test
    public void getLanguages() {
    }

    @Test
    public void flatMapTest() {

        /*Stream<String[]>		->flatMap -> Stream < String >
        Stream < Set < String >>	->flatMap -> Stream < String >
        Stream < List < String >>	->flatMap -> Stream < String >
        Stream < List < Object >>	->flatMap -> Stream < Object >
        List < Developer > developerList = new ArrayList<>();*/

        Developer d1 = new Developer("d1");
        d1.add("Java");
        d1.add("Javascript");
        d1.add("Python");

        Developer d2 = new Developer("d2");
        d2.add("C#");
        d2.add("C");
        d2.add("Groovy");

        developerList.add(d1);
        developerList.add(d2);

        List<String> teamLanguages = developerList.stream()
                .map(Developer::getLanguages)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Assert.assertTrue(teamLanguages.containsAll(d1.getLanguages()));
        Assert.assertTrue(teamLanguages.containsAll(d2.getLanguages()));

        List<String> languages = developerList.stream()
                .flatMap(developer -> developer.getLanguages().stream())
                .collect(Collectors.toList());

        Assert.assertTrue(languages.containsAll(d1.getLanguages()));
        Assert.assertTrue(languages.containsAll(d2.getLanguages()));
    }


}