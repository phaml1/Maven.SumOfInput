import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test

    @Test
    void sumOfNumbersEquals36() {
        var sumTest = new Main();
        assertEquals(36, sumTest.sumOfNumbers(8));
    }
}