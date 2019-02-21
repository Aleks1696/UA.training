package homework.block_6_task_registrationForm.test.controller;

import homework.block_6_task_registrationForm.app.controller.Regex;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegex {

    @Test
    public void testUS_NICK_NAME_REGEXPositive() {
        assertTrue("Molie1456".matches(Regex.US_NICK_NAME_REGEX));
        assertTrue("LoL_32_new".matches(Regex.US_NICK_NAME_REGEX));
        assertTrue("tONY-modi&".matches(Regex.US_NICK_NAME_REGEX));
    }

    @Test
    public void testUS_NICK_NAME_REGEXNegative() {
        assertFalse("45Molie1456".matches(Regex.US_NICK_NAME_REGEX));
        assertFalse("&LoL_32_new".matches(Regex.US_NICK_NAME_REGEX));
        assertFalse("+_--tONY-modi&".matches(Regex.US_NICK_NAME_REGEX));
    }

    @Test
    public void testUA_NICK_NAME_REGEXPositive() {
        assertTrue("Микола_(23)".matches(Regex.UA_NICK_NAME_REGEX));
        assertTrue("мій_Нік".matches(Regex.UA_NICK_NAME_REGEX));
        assertTrue("дІНО".matches(Regex.UA_NICK_NAME_REGEX));
    }

    @Test
    public void testUA_NICK_NAME_REGEXNegative() {
        assertFalse("_Арчі56".matches(Regex.UA_NICK_NAME_REGEX));
        assertFalse("...Я".matches(Regex.UA_NICK_NAME_REGEX));
        assertFalse("+ Маша = ".matches(Regex.UA_NICK_NAME_REGEX));
    }

    @Test
    public void testEMAIL_REGEXPositive() {
        assertTrue("antony@gmail.com".matches(Regex.EMAIL_REGEX));
        assertTrue("Antony@mail.ru".matches(Regex.EMAIL_REGEX));
        assertTrue("antony23@gmail.dot54".matches(Regex.EMAIL_REGEX));
        assertTrue("_antonY&&amilia98@gmail.com".matches(Regex.EMAIL_REGEX));
    }

    @Test
    public void testEMAIL_REGEXNegative() {
        assertFalse("anna_gmail.com".matches(Regex.EMAIL_REGEX));
        assertFalse("michael@@gmail.com".matches(Regex.EMAIL_REGEX));
        assertFalse("michael@gmail_com".matches(Regex.EMAIL_REGEX));
        assertFalse("michael@gmail".matches(Regex.EMAIL_REGEX));
        assertFalse("michael".matches(Regex.EMAIL_REGEX));
    }
}
