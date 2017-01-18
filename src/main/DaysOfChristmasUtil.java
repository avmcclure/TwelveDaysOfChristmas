package main;

public final class DaysOfChristmasUtil {

	public static final int MAX_DAY = 12;
	public static final int MIN_DAY = 1;
	private static final String DAY_RANGE = "Day must be greater than " + (MIN_DAY - 1) + " and less than " + (MAX_DAY + 1) + ".";

	public static int getPresentsForDay(int day) throws IllegalArgumentException {
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
		while(day > 0)
			sum += sumNaturalNumbers(day--);
		return sum;
	}
		
	private static int sumNaturalNumbers(int number) {
		int sum = (number * (number + 1)) / 2;
		return sum;
	}	
}
