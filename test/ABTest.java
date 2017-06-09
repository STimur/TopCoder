import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by tsalakhe on 09.06.2017.
 */
public class ABTest {
    private AB aB = new AB();

    @Test
    void testCreateString() {
        assertEquals("AA", aB.createString(2, 0));
        assertEquals("AAA", aB.createString(3, 0));
        assertEquals("AAAAAAA", aB.createString(7, 0));
    }
}
