import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest<args> {
    String[] args = {"2, 4, 5", "1, 3, 4"};
    @Test
    void mainScenario1() throws ClassNotFoundException{
        Printer.main(args);

    }
    String[] args2 = {"", ""};
    @Test
    void mainScenario2() throws ClassNotFoundException{
        Printer.main(args);

    }
}