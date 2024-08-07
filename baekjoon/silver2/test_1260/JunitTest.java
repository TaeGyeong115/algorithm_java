package silver2.test_1260;

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
                4 5 1
                1 2
                1 3
                1 4
                2 4
                3 4
                """;
        String expectedOutput = """
                1 2 4 3
                1 2 3 4""";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5 5 3
                5 4
                5 2
                1 2
                3 4
                3 1
                """;
        String expectedOutput = """
                3 1 2 5 4
                3 1 4 2 5""";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                1000 1 1000
                999 1000
                """;
        String expectedOutput = """
                1000 999
                1000 999""";

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
