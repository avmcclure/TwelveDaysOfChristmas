package main;

import java.util.List;

public class DaysOfChristmasMain {

    private InputOutputUtil ioUtil;
    
    public DaysOfChristmasMain() {
        ioUtil = new InputOutputUtil(System.in, System.out);
    }
  
    public static void main(String[] args) {
        DaysOfChristmasMain daysMain = new DaysOfChristmasMain();
        while(true) {
            daysMain.run();
        }
    }

    public void run() {
        try {
            ioUtil.printDayQuestion();
            int day = ioUtil.readNextInt();
            int presentSum = DaysOfChristmasUtil.getTotalPresentsForDay(day);
            ioUtil.printPresentsSum(day, presentSum);
            List<Present> presents = DaysOfChristmasUtil.getIndividualPresentsForDay(day);
            ioUtil.printAllPresents(presents);
        } catch (Exception e) {
            ioUtil.printLine(e.getMessage());
        }
    }
}
