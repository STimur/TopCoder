package AB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("AB", aB.createString(2, 1));
        assertEquals("", aB.createString(2, 2));
        //assertEquals("ABB", aB.createString(3, 2));
    }
}
