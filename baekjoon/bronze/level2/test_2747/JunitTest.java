package bronze.level2.test_2747;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =  "10";
        String expectedOutput = "55";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}