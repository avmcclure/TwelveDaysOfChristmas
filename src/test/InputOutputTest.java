package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.InputOutputUtil;
import main.Present;
import main.PresentEnumerable;

public class InputOutputTest {
    
    private InputOutputUtil ioUtil;
    
    @Test(expected=IllegalArgumentException.class)
    public void testReadNextIntChar() {
        ByteArrayInputStream in = new ByteArrayInputStream("test".getBytes());
        ioUtil = new InputOutputUtil(in, System.out);
        ioUtil.readNextInt();
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testReadNextIntDecimal() {
        ByteArrayInputStream in = new ByteArrayInputStream("1.2".getBytes());
        ioUtil = new InputOutputUtil(in, System.out);
        ioUtil.readNextInt();
    }
    
    @Test
    public void testReadNextIntValid() {
        ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
        ioUtil = new InputOutputUtil(in, System.out);
        ioUtil.readNextInt();
    }
    
    @Test
    public void testReadNextIntMax() {
        String max = Integer.toString(Integer.MAX_VALUE);
        ByteArrayInputStream in = new ByteArrayInputStream(max.getBytes());
        ioUtil = new InputOutputUtil(in, System.out);
        ioUtil.readNextInt();
    }
    
    @Test
    public void testReadNextIntMin() {
        String min = Integer.toString(Integer.MIN_VALUE);
        ByteArrayInputStream in = new ByteArrayInputStream(min.getBytes());
        ioUtil = new InputOutputUtil(in, System.out);
        ioUtil.readNextInt();
    }
    
    @Test
    public void testPrintPresentsOne() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        ioUtil = new InputOutputUtil(System.in, ps);
        
        ioUtil.printPresentsSum(1, 1);
        String expectedString = "On the 1st day of Christmas your true love should have given you: 1 present.";
        assertEquals(expectedString.trim(), os.toString().trim());
    }
    
    @Test
    public void testIndividualPrintPresentsOne() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        ioUtil = new InputOutputUtil(System.in, ps);
        
        Present present = new Present(PresentEnumerable.DAY_ONE, 1);
        List<Present> presents = new ArrayList<Present>();
        presents.add(present);
        
        ioUtil.printAllPresents(presents);
        String expectedString = "1 Partridge(s) in a Pear Tree";
        assertEquals(expectedString.trim(), os.toString().trim());
    }
}
