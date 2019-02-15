package homework.block_1_task_regex.model;

import homework.block_1_task_regex.model.entity.Note;
import homework.block_1_task_regex.model.entity.NoteBook;

public class Model {

    private Note note;
    private NoteBook noteBook;

    public void createNote(String surname, String name, String familyName,
                           String nickName, String commentary, String homePhoneNumber,
                           String mobilePhoneNumber, String email, String skype) {
        note = new Note(surname, name, familyName, nickName, commentary, homePhoneNumber,
                mobilePhoneNumber, email, skype);
        System.out.println(note);
    }

    public void createNoteBook() {
        noteBook = new NoteBook();
    }

    public void addCurrentNoteToNoteBook() {
        noteBook.getNoteList().add(note);
        System.out.println(noteBook);
    }


}
