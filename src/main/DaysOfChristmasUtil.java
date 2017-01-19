package main;

import java.util.ArrayList;
import java.util.List;

public final class DaysOfChristmasUtil {

    public static final int MAX_DAY = 12;
    public static final int MIN_DAY = 1;
    private static final String DAY_RANGE =
                    "Day must be greater than " + (MIN_DAY - 1) + " and less than " + (MAX_DAY + 1) + ".";
    private static final PresentEnumerable[] PRESENTS_BY_DAY = new PresentEnumerable[] {PresentEnumerable.DAY_ONE,
                    PresentEnumerable.DAY_TWO, PresentEnumerable.DAY_THREE, PresentEnumerable.DAY_FOUR,
                    PresentEnumerable.DAY_FIVE, PresentEnumerable.DAY_SIX, PresentEnumerable.DAY_SEVEN,
                    PresentEnumerable.DAY_EIGHT, PresentEnumerable.DAY_NINE, PresentEnumerable.DAY_TEN,
                    PresentEnumerable.DAY_ELEVEN, PresentEnumerable.DAY_TWELVE};

    public static int getTotalPresentsForDay(int day) throws IllegalArgumentException {
        boolean isValidDay = validateDay(day);
        if (isValidDay)
            return sumPresentsForDays(day);
        throw new IllegalArgumentException(DAY_RANGE);
    }

    private static boolean validateDay(int day) {
        if (day < MIN_DAY || day > MAX_DAY)
            return false;
        return true;
    }

    private static int sumPresentsForDays(int day) {
        int sum = 0;
        while (day > 0)
            sum += sumNaturalNumbers(day--);
        return sum;
    }

    private static int sumNaturalNumbers(int number) {
        int sum = (number * (number + 1)) / 2;
        return sum;
    }

    
    public static List<Present> getIndividualPresentsForDay(int selectedDay) {
        List<Present> presents = new ArrayList<Present>();
        for (int day = selectedDay, index = 0; day > 0; day--, index++) {
            Present present = getPresentForDay(day, index);
            presents.add(present);
        }
        return presents;
    }

    private static Present getPresentForDay(int day, int index) {
        PresentEnumerable presentDay = PRESENTS_BY_DAY[index];
        int multiplier = index + 1;
        int count = day * multiplier;
        Present present = new Present(presentDay, count);
        return present;
    }
}
