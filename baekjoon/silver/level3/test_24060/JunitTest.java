package silver.level3.test_24060;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5 7
                4 5 1 3 2
                """;
        String expectedOutput = "3";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5 13
                4 5 1 3 2
                """;
        String expectedOutput = "-1";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}