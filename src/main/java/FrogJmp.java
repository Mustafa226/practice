public class FrogJmp {

    public static final int MAX_LIMIT = 1000000000;

    public int solution(int X, int Y, int D) {
        if (X > MAX_LIMIT || Y > MAX_LIMIT || D > MAX_LIMIT || X > Y) {
            return 0;
        } else {
            int counter = 0;
            int distanceCovered = X;
            while (distanceCovered < Y) {
                distanceCovered += D;
                counter++;
            }
            return counter;
        }
    }

}
