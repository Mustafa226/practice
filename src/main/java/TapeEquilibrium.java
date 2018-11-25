class TapeEquilibrium {

    // 100 %
    int solution1(int[] A) {
        int result = Integer.MAX_VALUE;
        if (A != null) {
            int N = A.length;
            if (N < 2 || N > 100000) {
                return result;
            } else {
                int total = 0;
                int leftSum = 0;
                int rightSum = 0;
                for (int val : A) {
                    total += val;
                }
                for (int j = 0; j < (N - 1); j++) {
                    leftSum += A[j];
                    rightSum = total - leftSum;
                    int diff = Math.abs(leftSum - rightSum);
                    if (diff < result) {
                        result = diff;
                    }
                }
            }
        }
        return result;
    }

    // 50 %
    int solution2(int[] A) {
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
