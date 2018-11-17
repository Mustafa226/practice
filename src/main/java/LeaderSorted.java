public class LeaderSorted {

    int solution(int[] A) {
        if (A == null || A.length < 1 || A.length > 100000) {
            return -1;
        } else {
            // 5 10
            int middle = (A.length % 2) == 1 ? (int) (Math.floor(A.length / 2)) : ((A.length / 2) + 1);
            if (middle < A.length) {
                return A[0] == A[middle] ? 1 : -1;
            } else {
                return -1;
            }
        }
    }

}
