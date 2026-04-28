package main.java;

public class mainTest {

 @Test
 public void testStatus() {
   assertEquals("UP", main.status());
 }

 private void assertEquals(String string, String status) {
    throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
 }

}