package main;

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
            int presents = DaysOfChristmasUtil.getPresentsForDay(day);
            ioUtil.printPresents(day, presents);
        } catch (Exception e) {
            ioUtil.printLine(e.getMessage());
        }
    }
}
