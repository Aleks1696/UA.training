package homework.task_registrationFormDAO.app.model.dao.impl;

import homework.task_registrationFormDAO.app.model.dao.DAOFactory;
import homework.task_registrationFormDAO.app.model.dao.NoteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_DAOFactory extends DAOFactory {

    @Override
    public NoteDAO createNoteDAO() {
        return new JDBC_NoteDAO(getConnection());
    }

    private Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/notebook_db";
        String user = "myRoot";
        String password = "root";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Connection with DB is not established");
        }
    }
}
