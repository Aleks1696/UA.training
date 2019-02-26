package self_education.patterns.composition;

public class Video implements Component{
    private String title;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void printTitles() {
        System.out.println(title + " video is downloaded");
    }
}
