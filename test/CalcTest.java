import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }
    
    @Test
    public void testCalcTerfogat() {
        double actual = this.mainFrame.calcTerfogat(4, 16, 9);
        double expected = 576;
        assertEquals(expected, actual, 0.1);
    }

    


}
