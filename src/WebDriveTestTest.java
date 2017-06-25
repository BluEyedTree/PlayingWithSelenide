import static org.junit.Assert.*;

import org.junit.Test;
public class WebDriveTestTest{

	@Test
    public void testConcatenate() {
       WebDriveTest tester = new WebDriveTest();

        String result = tester.driveTest();

        assertEquals("Petition abcdef", result);
        
    }

}