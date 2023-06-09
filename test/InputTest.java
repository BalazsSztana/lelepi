/*
* File: InputTest.java
* Author: Sztana Balázs, SZOFT I-2-E
* Copyright: 2023, Sztana Balázs
* Date: 2023-05-23
*
*/
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCheckInputAlpha() {
        boolean actual = this.mainFrame.checkInput("a");
        assertFalse(actual);
    }
    @Test
    public void testCheckInputNum() {
        boolean actual = this.mainFrame.checkInput("55");
        assertTrue(actual);
    }
}
