package homework.block_6_task_registrationForm.test.model;

import homework.block_6_task_registrationForm.app.exceptions.InputDataIsNotUniqueException;
import homework.block_6_task_registrationForm.app.model.entity.EnumDBNote;
import homework.block_6_task_registrationForm.app.model.entity.Note;
import org.junit.Assert;
import org.junit.Test;

public class TestEnumDBNote {

    @Test
    public void testCheckNoteIFExistPositive() {
        Note note = new Note("нікНейм_(", "test@mail.com");
        try {
            EnumDBNote.checkNoteIfExist(note);
        } catch (InputDataIsNotUniqueException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test (expected = InputDataIsNotUniqueException.class)
    public void testCheckNoteIFExistNickNegative() throws InputDataIsNotUniqueException {
        Note note = new Note("іван", "test@ukr.net");
        EnumDBNote.checkNoteIfExist(note);
    }

    @Test (expected = InputDataIsNotUniqueException.class)
    public void testCheckNoteIFExistEmailNegative() throws InputDataIsNotUniqueException {
        Note note = new Note("тест", "Roling_Mat@unp.com");
        EnumDBNote.checkNoteIfExist(note);
    }
}
