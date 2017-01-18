package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DaysOfChristmasUtil;

public class DaysOfChristmasTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMinMinusOne() {
        DaysOfChristmasUtil.getPresentsForDay(DaysOfChristmasUtil.MIN_DAY - 1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testMaxPlusOne() {
        DaysOfChristmasUtil.getPresentsForDay(DaysOfChristmasUtil.MAX_DAY + 1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        DaysOfChristmasUtil.getPresentsForDay(-1);
    }
  
    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt() {
        DaysOfChristmasUtil.getPresentsForDay(Integer.MAX_VALUE);
    }
  
    @Test
    public void testOne() {
        int dayOnePresents = DaysOfChristmasUtil.getPresentsForDay(1);
        assertEquals(dayOnePresents, 1);
    }
  
    @Test
    public void testTwelve() {
        int dayTwelvePresents = DaysOfChristmasUtil.getPresentsForDay(12);
        assertEquals(dayTwelvePresents, 364);
    }
}
