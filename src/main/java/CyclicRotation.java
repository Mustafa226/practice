public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int length = A.length;
        int[] result = new int[length];
        if (K < 0 || K > 100 || length > 100) {
            return result;
        } else {
            int newPosition;
            for (int i = 0; i < length; i++) {
                newPosition = i + K;
                if (newPosition >= length) {
                    newPosition = newPosition % length;
                }
                result[newPosition] = A[i];
            }
        }
        return result;
    }

}
