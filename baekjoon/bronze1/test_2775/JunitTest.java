package bronze1.test_2775;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "2\n1\n3\n2\n3";
        String expectedOutput = "6\n10\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        String actualOutput = stdout.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}