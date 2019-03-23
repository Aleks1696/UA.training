package homework.task_registrationFormDAO.app.model.dao.impl;

import homework.task_registrationFormDAO.app.exceptions.NotUniqueInputData;
import homework.task_registrationFormDAO.app.model.dao.NoteDAO;
import homework.task_registrationFormDAO.app.model.entity.Note;
import homework.task_registrationFormDAO.app.view.Messages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_NoteDAO implements NoteDAO {
    private Connection connection;

    public JDBC_NoteDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(Note note) throws NotUniqueInputData {
        try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO notebook_db.notebook (nickName, email) VALUES (?, ?)")) {
            statement.setString(1, note.getNickName());
            statement.setString(2, note.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new NotUniqueInputData(Messages.NOT_UNIQUE_DATA);
        }
        return true;
    }
}
