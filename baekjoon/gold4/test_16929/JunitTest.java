package gold4.test_16929;

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
                3 4
                AAAA
                ABCA
                AAAA
                """;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                3 4
                AAAA
                ABCA
                AADA
                """;
        String expectedOutput = "No";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 4
                YYYR
                BYBY
                BBBY
                BBBY
                """;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                7 6
                AAAAAB
                ABBBAB
                ABAAAB
                ABABBB
                ABAAAB
                ABBBAB
                AAAAAB
                """;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = """
                2 13
                ABCDEFGHIJKLM
                NOPQRSTUVWXYZ
                """;
        String expectedOutput = "No";

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