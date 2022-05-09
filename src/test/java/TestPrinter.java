import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 7);
    }

    @Test
    public void hasPaper() {
        assertEquals(10, printer.getSheetsOfPaper());
    }

    @Test
    public void canSetPaper() {
        printer.setSheetsOfPaper(3);
        assertEquals(3, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(7, printer.getTonerVolume());
    }

    @Test
    public void canSetToner() {
        printer.setTonerVolume(4);
        assertEquals(4, printer.getTonerVolume());
    }

    @Test
    public void testCanPrintReducePaper() {
        printer.print(3, 2);
        assertEquals(4, printer.getSheetsOfPaper());
    }

    @Test
    public void testCannotPrintNotEnoughPaper() {
        printer.print(5, 3);
        assertEquals(10, printer.getSheetsOfPaper());
    }

    @Test
    public void testCanPrintReduceToner() {
        printer.print(2, 2);
        assertEquals(3, printer.getTonerVolume());
    }

    @Test
    public void testCannotPrintNotEnoughToner() {
        printer.print(2, 4);
        assertEquals(7, printer.getTonerVolume());
    }

}
