package learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IterablesTest {

    public static void main(String[] args) {
        IterablesTest.printElements(Arrays.asList(1, 2, 3));
    }

    private static <E> void printElements(Iterable<E> elements) {
        for (E elem : elements) {
            System.out.println(elem);
        }
    }

    private static <E> void printElements(Collection<E> elements) {
        for (E elem : elements) {
            System.out.println(elem);
        }
    }

    private static <E> void printElements(List<E> elements) {
        for (E elem : elements) {
            System.out.println(elem);
        }
    }

}
