import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStringIfNumberDivisibleBy {

    private static final Map<Integer, String> map;

    static {
        map = new HashMap<>();
        map.put(2, "Codility");
        map.put(3, "Test");
        map.put(5, "Coders");
    }

    public void solution(int N) {
        if (N >= 1 && N <= 1000) {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = i + 1;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int value : arr) {
                List<Integer> divisibleBy = map.keySet().stream().filter(integer -> (value % integer == 0))
                        .collect(Collectors.toList());
                if (divisibleBy.isEmpty()) {
                    stringBuilder.append(value);
                } else {
                    divisibleBy.forEach(key -> {
                        stringBuilder.append(map.get(key));
                    });
                }
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
