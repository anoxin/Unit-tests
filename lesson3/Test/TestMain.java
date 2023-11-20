import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;


public class TestMain {
    @Test
    public void testEvenOddNumber() {
        MainHW hw = new MainHW();
        assertTrue(hw.evenOddNumber(2));
        assertFalse(hw.evenOddNumber(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    public void testNumberInInterval(int i) {
        MainHW hw = new MainHW();
        assertTrue(hw.numberInInterval(i));
        assertFalse(hw.numberInInterval(110));
    }

}
