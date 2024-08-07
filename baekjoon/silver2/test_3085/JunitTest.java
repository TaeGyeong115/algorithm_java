package silver2.test_3085;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3
                CCP
                CCP
                PPC
                """;
        String expectedOutput = "3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4
                PPPP
                CYZY
                CCPY
                PPCC
                """;
        String expectedOutput = "4";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                5
                YCPZY
                CYZZP
                CCPPP
                YCYZC
                CPPZZ
                """;
        String expectedOutput = "4";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
