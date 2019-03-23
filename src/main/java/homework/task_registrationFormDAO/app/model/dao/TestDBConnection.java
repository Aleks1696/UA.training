package homework.task_registrationFormDAO.app.model.dao;

public class TestDBConnection {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance();
        NoteDAO dao = factory.createNoteDAO();


    }
}
