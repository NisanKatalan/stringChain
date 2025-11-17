package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Integration_C_D_Test {
    @Test
    public void testIntegrationAToB(){
        EStub EStub = new EStub();
        D reald = new D(EStub);
		C realc = new C(reald);
        String result = realc.process("HE"); // מתחילים מ-c
        // מאמתים את הפלט הסופי
        assertEquals("HELL", result);
    }


    
    

}