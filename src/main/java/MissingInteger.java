import java.util.HashSet;

class MissingInteger {

    int solution(int[] A) {
        int result = 1;
        if (A == null)
            return result;
        int length = A.length;
        if (length < 1 || length > 100000) {
            return 1;
        } else {
            HashSet<Integer> set = new HashSet<>();
            for (int i : A) {
                set.add(i);
            }
            while (set.contains(result)) {
                result++;
            }
            return result;
        }
    }

}