package topcoder;

import java.util.Arrays;

/**
 * Created by tsalakhe on 09.06.2017.
 */
public class AB {
    private int len;
    private int numOfABPairs;

    public String createString(int len, int numOfABPairs) {
        this.len = len;
        this.numOfABPairs = numOfABPairs;
        if (!isPossibleNumberOfABPairs())
            return "";
        if (numOfABPairs == 0) {
            char[] chars = new char[len];
            Arrays.fill(chars, 'A');
            return new String(chars);
        }
        if (numOfABPairs < len) {
            char[] chars = new char[len];
            Arrays.fill(chars, 0, 1, 'A');
            Arrays.fill(chars, 1, numOfABPairs + 1, 'B');
            Arrays.fill(chars, numOfABPairs + 1, len, 'A');
            return new String(chars);
        } else {
            char[] chars = new char[len];
            Arrays.fill(chars, 0, 1, 'A');
            Arrays.fill(chars, 1, len, 'B');

            int currentNumberOfPairs = len - 1;
            int numberOfPairsToAdd = numOfABPairs - currentNumberOfPairs;
            int indexToInsertA = 1;
            int newPairsCreated = len - 2 - indexToInsertA;

            while (numberOfPairsToAdd != 0) {
                if (numberOfPairsToAdd >= newPairsCreated) {
                    chars[indexToInsertA] = 'A';
                    numberOfPairsToAdd -= newPairsCreated;
                }
                indexToInsertA++;
                newPairsCreated = len - 2 - indexToInsertA;
            }

            return new String(chars);
        }
    }

    private boolean isPossibleNumberOfABPairs() {
        return numOfABPairs <= ((int)Math.ceil(len/2.0)) * ((int)Math.floor(len/2.0));
    }
}
