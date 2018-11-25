public class TapeEquilibrium {

    public int solution(int[] A){
        int result = Integer.MAX_VALUE;
        if (A != null) {
            int N = A.length;
            if (N < 2 || N > 100000) {
                return result;
            } else {
                int P = 1;
                while (P < N) {
                    int leftSum = 0;
                    int rightSum = 0;
                    for (int i = 0; i < N; i++) {
                        if (i < P) {
                            leftSum += A[i];
                        } else {
                            rightSum += A[i];
                        }
                    }
                    int absDiff = Math.abs(leftSum - rightSum);
                    if (absDiff < result) {
                        result = absDiff;
                    }
                    P++;
                }
            }
        }
        return result;
    }

}
