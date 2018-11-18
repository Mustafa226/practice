import java.util.Arrays;
import java.util.HashSet;

public class PermMissingElement {

    int solution(int[] A) {
        int length = A.length;
        if (length > 100000) {
            return 0;
        } else {
            HashSet<Integer> set = new HashSet<>();
            Arrays.stream(A).boxed().forEach(set::add);
            int iterator = 1;
            while (set.contains(iterator)) {
                iterator++;
                if (iterator > length + 1)
                    break;
            }
            return iterator;
        }
    }

}
