package homework.block_6_task_registrationForm.app.model;

import homework.block_6_task_registrationForm.app.exceptions.WrongInputDataException;
import homework.block_6_task_registrationForm.app.model.entity.EnumDBNote;
import homework.block_6_task_registrationForm.app.model.entity.Note;

public class Model {

    private Note note;

    public void createNote(String surname, String name, String familyName,
                           String nickName, String commentary, String homePhoneNumber,
                           String mobilePhoneNumber, String email, String skype) {
        note = new Note(surname, name, familyName, nickName, commentary, homePhoneNumber,
                mobilePhoneNumber, email, skype);
    }

    public void addNoteToDB() throws WrongInputDataException {
        EnumDBNote.checkNoteIfExist(note);
    }

    public Note getNote() {
        return note;
    }
}
