package bronze.level2.test_8958;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                OOXXOXXOOO
                OOXXOOXXOO
                OXOXOXOXOXOXOX
                OOOOOOOOOO
                OOOOXOOOOXOOOOX
                """;
        String expectedOutput = """
                10
                9
                7
                55
                30
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
