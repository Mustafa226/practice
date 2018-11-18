import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int result = 0;
        int N = A.length;
        if ((N % 2 != 1) || (N <= 0) || (N > 1000000)) {
            return result;
        } else {
            return Arrays.stream(A).boxed().collect(Collectors.groupingBy(value -> value))
                    .entrySet().stream().filter(entry -> entry.getValue().size() == 1)
                    .map(Map.Entry::getKey).findAny().orElse(0);
        }
    }

}
