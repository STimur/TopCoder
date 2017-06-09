package AB;

import java.util.Arrays;
import java.util.Collections;

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
        return String.join("", Collections.nCopies(numOfABPairs, "AB"));
    }

    private boolean isPossibleNumberOfABPairs() {
        return numOfABPairs <= ((int)Math.ceil(len/2)) * ((int)Math.floor(len/2));
    }
}
