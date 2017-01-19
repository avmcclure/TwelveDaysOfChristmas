package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import main.DaysOfChristmasUtil;
import main.Present;

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
    public void testSumOne() {
        int dayOnePresents = DaysOfChristmasUtil.getTotalPresentsForDay(1);
        assertEquals(dayOnePresents, 1);
    }
  
    @Test
    public void testSumTwelve() {
        int dayTwelvePresents = DaysOfChristmasUtil.getTotalPresentsForDay(12);
        assertEquals(dayTwelvePresents, 364);
    }
        
    @Test
    public void testIndividualOne() {
        List<Present> dayOnePresents = DaysOfChristmasUtil.getIndividualPresentsForDay(1);
        int numberOfDayOnePresents = dayOnePresents.get(0).getNumberOfPresents();
        assertTrue(dayOnePresents.size() == 1 && numberOfDayOnePresents == 1);
    }
    
    @Test
    public void testIndividualTwelve() {
        List<Present> dayTwelvePresents = DaysOfChristmasUtil.getIndividualPresentsForDay(12);
        int numberOfDayOnePresents = dayTwelvePresents.get(0).getNumberOfPresents();
        assertTrue(dayTwelvePresents.size() == 12 && numberOfDayOnePresents == 12);
    }
}
