package topcoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Timur on 11-Jun-17.
 */
public class ANewHopeTest {

    private ANewHope aNewHope;

    @BeforeEach
    void setUp() {
        aNewHope = new ANewHope();
    }

    @Test
    void count() {
        assertEquals(1, aNewHope.count(new int[]{1, 2}, new int[]{1, 2}, 1));
    }
}
