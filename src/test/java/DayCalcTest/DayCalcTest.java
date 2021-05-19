package DayCalcTest;

import DayCalc.DayCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayCalcTest {
    DayCalc dc = new DayCalc();

    @Test
    public void test1() {
        assertEquals('수' , dc.DayofDate(2021,5,19));
    }

    @Test
    public void test2() {
        assertEquals('목' , dc.DayofDate(2021,5,20));
    }

    @Test
    public void test3() {
        assertEquals('금' , dc.DayofDate(2021,5,21));
    }

    @Test
    public void test4() {
        assertEquals('토' , dc.DayofDate(2021,5,22));
    }

    @Test
    public void test5() {
        assertEquals('일' , dc.DayofDate(2021,5,23));
    }
}
