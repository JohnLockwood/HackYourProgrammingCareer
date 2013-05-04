import junit.framework.TestCase;

public class HelloJUnit extends TestCase {
    // This test fails
    public void testHello() {
        String expected = "Hello, JUnit!";
        String hello = "Goodbye, cruel bug!";
        assertEquals(hello, expected);
    }
}
