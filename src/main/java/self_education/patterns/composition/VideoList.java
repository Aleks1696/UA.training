package self_education.patterns.composition;

import java.util.ArrayList;
import java.util.List;

public class VideoList implements Component {
    private List<Component> videoList = new ArrayList<>();

    public void addVideo(Component video) {
        videoList.add(video);
    }

    @Override
    public void printTitles() {
        for (Component c : videoList) {
            c.printTitles();
        }
    }
}