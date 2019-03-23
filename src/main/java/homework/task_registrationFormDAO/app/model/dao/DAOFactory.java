package homework.task_registrationFormDAO.app.model.dao;

import homework.task_registrationFormDAO.app.model.dao.impl.JDBC_DAOFactory;

public abstract class DAOFactory {
    private static DAOFactory daoFactory;

    public abstract NoteDAO createNoteDAO();

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DAOFactory.class) {
                if (daoFactory == null) {
                    daoFactory = new JDBC_DAOFactory();
                }
            }
        }
        return daoFactory;
    }
}
