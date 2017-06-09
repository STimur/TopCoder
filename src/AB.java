import java.util.Arrays;

/**
 * Created by tsalakhe on 09.06.2017.
 */
public class AB {
    public String createString(int len, int numOfABPairs) {
        char[] chars = new char[len];
        Arrays.fill(chars, 'A');
        return new String(chars);
    }
}
