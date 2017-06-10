package ANDEquation;

import java.util.Arrays;

/**
 * Created by Timur on 11-Jun-17.
 */
public class ANDEquation {
    public int restoreY(int[] ints) {
        Arrays.sort(ints);
        int res = 1048575;
        for (int i = 1; i < ints.length; i++)
            res &= ints[i];
        if (ints[0] == res)
            return res;
        return -1;
    }
}
