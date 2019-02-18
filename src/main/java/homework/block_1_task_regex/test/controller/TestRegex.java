package homework.block_1_task_regex.test.controller;

import static org.junit.Assert.*;

import homework.block_1_task_regex.app.controller.Regex;
import org.junit.Test;

public class TestRegex {

    @Test
    public void testUS_NAME_REGEXPositive() {
        assertTrue("John".matches(Regex.US_NAME_REGEX));
        assertTrue("Emilie".matches(Regex.US_NAME_REGEX));
        assertTrue("Flipper".matches(Regex.US_NAME_REGEX));
        assertTrue("Andy-Case".matches(Regex.US_NAME_REGEX));
        assertTrue("M'c".matches(Regex.US_NAME_REGEX));
    }

    @Test
    public void testUS_NAME_REGEXNegative() {
        assertFalse("john".matches(Regex.US_NAME_REGEX));
        assertFalse("EmiLie".matches(Regex.US_NAME_REGEX));
        assertFalse("Flipper-".matches(Regex.US_NAME_REGEX));
        assertFalse("Andy-case".matches(Regex.US_NAME_REGEX));
        assertFalse("'Monica".matches(Regex.US_NAME_REGEX));
        assertFalse("Judi_m".matches(Regex.US_NAME_REGEX));
    }

    @Test
    public void testUA_NAME_REGEXPositive() {
        assertTrue("Зав'ялов".matches(Regex.UA_NAME_REGEX));
        assertTrue("Квітка-Основ'яненко".matches(Regex.UA_NAME_REGEX));
        assertTrue("Симеренко".matches(Regex.UA_NAME_REGEX));

    }

    @Test
    public void testUA_NAME_REGEXNegative() {
        assertFalse("круТь".matches(Regex.UA_NAME_REGEX));
        assertFalse("Соломін-".matches(Regex.UA_NAME_REGEX));
        assertFalse("МОлодий".matches(Regex.UA_NAME_REGEX));
        assertFalse("Рома ненко".matches(Regex.UA_NAME_REGEX));
    }

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
    public void testCOMMENTARY_REGEX() {
        assertTrue("This _ comment %(can contain EVERY*thing)-".matches(Regex.COMMENTARY_REGEX));
    }

    @Test
    public void testHOME_PHONE_NUMBER_REGEXPositive() {
        assertTrue("+026-556-45-45".matches(Regex.HOME_PHONE_NUMBER_REGEX));
    }

    @Test
    public void testHOME_PHONE_NUMBER_REGEXNegative() {
        assertFalse("(026)-556-45-45".matches(Regex.HOME_PHONE_NUMBER_REGEX));
        assertFalse("(026)-556-45".matches(Regex.HOME_PHONE_NUMBER_REGEX));
        assertFalse("+026 556 45".matches(Regex.HOME_PHONE_NUMBER_REGEX));
    }

    @Test
    public void testMOBILE_PHONE_NUMBER_REGEXPositive() {
        assertTrue("+480(06)-945-45-30".matches(Regex.MOBILE_PHONE_NUMBER_REGEX));
    }

    @Test
    public void testMOBILE_PHONE_NUMBER_REGEXNegative() {
        assertFalse("+026-556-45-45".matches(Regex.MOBILE_PHONE_NUMBER_REGEX));
        assertFalse("+480(87)-556-45-df".matches(Regex.MOBILE_PHONE_NUMBER_REGEX));
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

    @Test
    public void testSKYPE_REGEXPositive() {
        assertTrue("antony".matches(Regex.SKYPE_REGEX));
        assertTrue("Thunder_storm 54".matches(Regex.SKYPE_REGEX));
    }

    @Test
    public void testSKYPE_REGEXNegative() {
        assertFalse(" ".matches(Regex.SKYPE_REGEX));
        assertFalse("56Gregory".matches(Regex.SKYPE_REGEX));
        assertFalse("_N_I_K".matches(Regex.SKYPE_REGEX));
        assertFalse("NIK_______________________".matches(Regex.SKYPE_REGEX));
    }


}
