package test.java;

import main.java.main;
// import org.junit.Test;
// import static org.junit.Assert.assertEquals;

public class mainTest {

    @Test
    public void testStatus() {
        assertEquals("UP", main.status());
    }

    private void assertEquals(String string, String status) {
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}