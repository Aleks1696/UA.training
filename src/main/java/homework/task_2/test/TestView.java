package homework.task_2.test;

import homework.task_2.game.View;
import org.junit.Before;
import org.junit.Test;

public class TestView {

    private static View view;

    @Before
    public void initializeView() {
        view = new View();
    }

    @Test
    public void testPrint() {
        String messageToTestPrint = "This should be printed to console";
        view.print(messageToTestPrint);
    }
}
