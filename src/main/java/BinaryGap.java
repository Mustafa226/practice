class BinaryGap {

    int solution(int N) {
        int result = 0;
        if (N <= 0) {
            return result;
        } else {
            String s = Integer.toString(N, 2);
            int[] bitArr = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                bitArr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            for (int i = 0; i < bitArr.length; i++) {
                result = countBinaryGapLength(result, bitArr, i);
            }
            return result;
        }
    }

    private int countBinaryGapLength(int result, int[] bitArray, int index) {
        int bitArrLength = bitArray.length;
        int binaryGapLength, j;
        if (bitArray[index] == 1) {
            binaryGapLength = 0;
            j = index + 1;
            if (j < bitArrLength) {
                while (bitArray[j] == 0) {
                    j++;
                    binaryGapLength++;
                    if (j >= bitArrLength) {
                        break;
                    }
                }
            }
            if ((j < bitArrLength) && (bitArray[j] == 1) && (result < binaryGapLength)) {
                result = binaryGapLength;
            }
        }
        return result;
    }

}
