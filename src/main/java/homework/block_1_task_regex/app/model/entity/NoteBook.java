package homework.block_1_task_regex.app.model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private List<Note> noteList = new ArrayList<>();

    public List<Note> getNoteList() {
        return noteList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NoteBook{");
        sb.append("noteList=").append(noteList);
        sb.append('}');
        return sb.toString();
    }
}
