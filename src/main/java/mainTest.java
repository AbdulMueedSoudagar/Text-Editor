package main.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class mainTest {

    @Test
    public void testStatus() {
        assertEquals("UP", main.status());
    }
}