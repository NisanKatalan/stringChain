package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        DStub stub = new DStub();
        // יוצרים את C עם הסטאב
        C c = new C(stub);

        // קוראים ל־C — לא לסטאב!
        String result = c.process("HE");

        // מאמתים את הפלט
        assertEquals("HEL", result);
    }
}