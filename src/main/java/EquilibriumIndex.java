class EquilibriumIndex {

    int solve(int A[], int N) {
        if (N < 0 || N > 100000 || A == null) {
            return -1;
        } else {
            int leftSum, rightSum, i, j;
            for (i = 0; i < N; i++) {
                leftSum = 0;
                rightSum = 0;
                for (j = 0; j < i; j++) {
                    leftSum += A[j];
                }
                for (j = i + 1; j < N; j++) {
                    rightSum += A[j];
                }
                if (leftSum == rightSum) {
                    return i;
                }
            }
        }
        return -1;
    }
}
