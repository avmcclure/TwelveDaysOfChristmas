package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DaysOfChristmasUtil;

public class DaysOfChristmasTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMinMinusOne() {
        DaysOfChristmasUtil.getTotalPresentsForDay(DaysOfChristmasUtil.MIN_DAY - 1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testMaxPlusOne() {
        DaysOfChristmasUtil.getTotalPresentsForDay(DaysOfChristmasUtil.MAX_DAY + 1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        DaysOfChristmasUtil.getTotalPresentsForDay(-1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt() {
        DaysOfChristmasUtil.getTotalPresentsForDay(Integer.MAX_VALUE);
    }
  
    @Test
    public void testOne() {
        int dayOnePresents = DaysOfChristmasUtil.getTotalPresentsForDay(1);
        assertEquals(dayOnePresents, 1);
    }
  
    @Test
    public void testTwelve() {
        int dayTwelvePresents = DaysOfChristmasUtil.getTotalPresentsForDay(12);
        assertEquals(dayTwelvePresents, 364);
    }
}
