
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCheckerTest {

    @Test
    public void testCheckNumberGenap() {
        NumberChecker tChecker = new NumberChecker();


		assertEquals(tChecker.checkNumber(2),"Genap");
	
    }

    public void testCheckNumberGanjil() {
        NumberChecker tChecker = new NumberChecker();


		assertEquals(tChecker.checkNumber(1),"Ganjil");
	
    }


}
