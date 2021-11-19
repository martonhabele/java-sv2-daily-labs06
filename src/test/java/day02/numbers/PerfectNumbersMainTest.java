package day02.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersMainTest {
    @Test
    void isPerfectNumberTest() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertFalse(perfectNumbers.isPerfectNumber(7246));
    }
}