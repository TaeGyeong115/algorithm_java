package bronze3.test_10992;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "1";
        String expectedOutput = """
                *
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "2";
        String expectedOutput = """
                 *
                ***
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = "3";
        String expectedOutput = """
                  *
                 * *
                *****
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = "4";
        String expectedOutput = """
                   *
                  * *
                 *   *
                *******
                """;

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
