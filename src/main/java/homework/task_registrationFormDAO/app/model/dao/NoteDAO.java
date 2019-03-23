package homework.task_registrationFormDAO.app.model.dao;

import homework.task_registrationFormDAO.app.exceptions.NotUniqueInputData;
import homework.task_registrationFormDAO.app.model.entity.Note;

public interface NoteDAO {
    boolean create(Note note) throws NotUniqueInputData;
}
