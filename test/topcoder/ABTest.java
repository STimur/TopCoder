package topcoder;

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
        assertEquals("ABB", aB.createString(3, 2));
        assertEquals("", aB.createString(3, 3));
        assertEquals("ABAA", aB.createString(4, 1));
        assertEquals("ABBA", aB.createString(4, 2));
        assertEquals("ABBB", aB.createString(4, 3));
        assertEquals("AABB", aB.createString(4, 4));
        assertEquals("", aB.createString(4, 5));
        assertEquals("AAAAA", aB.createString(5, 0));
        assertEquals("ABAAA", aB.createString(5, 1));
        assertEquals("ABBBB", aB.createString(5, 4));
        assertEquals("ABABB", aB.createString(5, 5));
        assertEquals("AABBB", aB.createString(5, 6));
        assertEquals("", aB.createString(5, 8));
        assertEquals("ABBBBABBBB", aB.createString(10, 12));
    }
}
