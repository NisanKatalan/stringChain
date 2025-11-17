package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AUnitTest {
    @Test
    public void testAWithStub() {
        // יוצרים סטאב של B
        BStub stub = new BStub();
        // יוצרים את A עם הסטאב
        A a = new A(stub);

        String result = a.process("");

        // מאמתים את הפלט
        assertEquals("HT", result);
    }
}