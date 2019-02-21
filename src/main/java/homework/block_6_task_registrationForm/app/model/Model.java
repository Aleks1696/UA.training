package homework.block_6_task_registrationForm.app.model;

import homework.block_6_task_registrationForm.app.exceptions.InputDataIsNotUniqueException;
import homework.block_6_task_registrationForm.app.model.entity.EnumDBNote;
import homework.block_6_task_registrationForm.app.model.entity.Note;

public class Model {
    private Note note;

    public void createNote(String nickName, String email) {
        note = new Note(nickName, email);
    }

    public void addNoteToDB() throws InputDataIsNotUniqueException {
        EnumDBNote.checkNoteIfExist(note);
    }

    public Note getNote() {
        return note;
    }
}
