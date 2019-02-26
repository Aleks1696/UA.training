package self_education.patterns.composition;

public class Main {
    public static void main(String[] args) {
        VideoList server = new VideoList();

        VideoList videoList1 = new VideoList();
        Component hahaVideo = new Video("You will laugh for 10 hours");
        Component sadVideo = new Video("Why people are so stupid?");
        videoList1.addVideo(hahaVideo);
        videoList1.addVideo(sadVideo);

        server.addVideo(videoList1);

        Component singleVideo = new Video("How to learn Java in 6 hours?");

        server.addVideo(singleVideo);

        VideoList news = new VideoList();
        Component morningNews = new Video("Peoples are scared by...");
        Component weekNews = new Video("This week was hard for...");
        news.addVideo(morningNews);
        news.addVideo(weekNews);

        server.addVideo(news);

        server.printTitles();
    }
}
