package singleton;

import org.junit.Test;
import patterns.singleton.Logger;


public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        //When
        // Then
        Logger.getInstance().log("New log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        System.out.println("The last log is: " + lastLog);
    }
}
