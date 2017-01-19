package main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class InputOutputUtil {
    private static final String DAY_QUESTION = "Which day of Christmas is it? (Min: " + DaysOfChristmasUtil.MIN_DAY + ", Max: " + DaysOfChristmasUtil.MAX_DAY + ")"; 
    private static final String VALID_INPUT_MESSAGE = "Could not get valid integer from input.";

    private Scanner scanner;
    private PrintStream printStream;
    
    public InputOutputUtil(InputStream in, PrintStream printStream) {
        this.scanner = new Scanner(in);
        this.printStream = printStream;
    }
        
    public int readNextInt() throws IllegalArgumentException {        
        if(scanner.hasNextInt())
            return scanner.nextInt();
        scanner.next();
        throw new IllegalArgumentException(VALID_INPUT_MESSAGE);
    }
        
    public void printLine(String line) {
        printStream.println(line);
    }
    
    public void printDayQuestion() {
        printLine(DAY_QUESTION);
    }
    
    public void printPresentsSum(int day, int presents) {
        String presentsString = buildPresentsSumString(day, presents);
        printLine(presentsString);
    }
    
    private String buildPresentsSumString(int day, int presents){
        String ordinalDay = calculateOrdinalNumber(day);
        String presentsPlurality = getSingularOrPluralPresents(presents);
        
        StringBuilder sb = new StringBuilder("On the ");
        sb.append(ordinalDay);
        sb.append(" day of Christmas your true love should have given you: ");
        sb.append(presents);
        sb.append(presentsPlurality);      
        
        return sb.toString();
    }
          
    private String calculateOrdinalNumber(int number) {
        int tensMod = number % 10;
        int hundredsMod = number % 100;
        
        if(tensMod == 1 && hundredsMod != 11)
            return number + "st";
        if(tensMod == 2 && hundredsMod != 12)
            return number + "nd";
        if(tensMod == 3 && hundredsMod != 13)
            return number + "rd";
        return number + "th";
    }
    
    private String getSingularOrPluralPresents(int presents) {
        if(presents == 1)
            return " present.";
        return " presents.";
    }
    
    
    public void printAllPresents(List<Present> presents) {
        presents.forEach(present -> printPresentLine(present));
    }
    
    private void printPresentLine(Present present) {
    	String line = present.getNumberOfPresents() + " " + present.getPresentType();
    	printLine(line);
    }
}
