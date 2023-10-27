import org.junit.Test;
import static org.junit.Assert.*;

public class ParityBitJavaTest {

    @Test
    public void testValidClientNumber() {
        ParityBitJava obj = new ParityBitJava();
        assertTrue(obj.validateClientNumber("8456894318"));
    }

    @Test
    public void testInvalidClientNumber() {
        ParityBitJava obj = new ParityBitJava();
        assertFalse(obj.validateClientNumber("3456848879"));
    }

    @Test
    public void testNonDigitCharacter() {
        ParityBitJava obj = new ParityBitJava();
        assertFalse(obj.validateClientNumber("34568488a9"));
    }

    @Test
    public void testWrongLength() {
        ParityBitJava obj = new ParityBitJava();
        assertFalse(obj.validateClientNumber("34568488"));
    }

    @Test
    public void testAnotherValidClientNumber() {
        ParityBitJava obj = new ParityBitJava();
        assertTrue(obj.validateClientNumber("0000000000"));
    }
}
