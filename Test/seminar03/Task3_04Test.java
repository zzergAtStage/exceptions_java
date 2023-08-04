package seminar03;

import lesson02.Task04;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Task3_04Test {
    String testString1 = " ";
    String testString2 = "";
    String testString3 = "Some text";


    @Test
    void getUserInput() throws Exception {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(testString2.getBytes());
        System.setIn(in);
        Task3_04.getUserInput();
        System.setIn(sysInBackup);
    }
}