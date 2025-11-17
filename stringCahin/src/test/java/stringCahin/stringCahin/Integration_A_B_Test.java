package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

  // בדיקות אינטגרציה בין A ל-B

public class Integration_A_B_Test {
    @Test
    public void testIntegrationAToB(){
        CStub cStub = new CStub();
        B realb = new B(cStub);
        A reala = new A(realb);
        String result = reala.process(""); // מתחילים מ-A
        // מאמתים את הפלט הסופי
        assertEquals("HE", result);
    }


    
    

}