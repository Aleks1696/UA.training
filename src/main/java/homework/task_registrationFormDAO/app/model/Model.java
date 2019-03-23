package homework.task_registrationFormDAO.app.model;

import homework.task_registrationFormDAO.app.exceptions.NotUniqueInputData;
import homework.task_registrationFormDAO.app.model.dao.DAOFactory;
import homework.task_registrationFormDAO.app.model.dao.NoteDAO;
import homework.task_registrationFormDAO.app.model.entity.Note;

public class Model {
    private Note note;

    public void createNote(String nickName, String email) {
        note = new Note(nickName, email);
    }

    public void addNoteToDB() throws NotUniqueInputData {
        DAOFactory factory = DAOFactory.getInstance();
        NoteDAO dao = factory.createNoteDAO();
        dao.create(note);
    }

    public Note getNote() {
        return note;
    }
}
