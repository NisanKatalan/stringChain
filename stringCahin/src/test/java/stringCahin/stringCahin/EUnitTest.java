package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EUnitTest {
    @Test
    public void testEWithStub() {
       
        // יוצרים את E עם הסטאב
        E e = new E();

        String result = e.process("HELL");

        // אימות את הפלט
        assertEquals("HELLO", result);
    }
}