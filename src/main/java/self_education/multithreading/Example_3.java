package self_education.multithreading;

import java.util.stream.Stream;

public class Example_3 {
    public static void main(String[] args) {
        Document document = new Document();
        Writer [] writers = new Writer[]{
                new Writer(document),
                new Writer(document),
                new Writer(document)
        };
        Stream.of(writers).forEach(Thread::start);
        Downloader downloader = new Downloader(document);
        downloader.start();
    }
}

class Document {
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public boolean isReady() {
        return data != null;
    }
}
class Downloader extends Thread {
    private Document document;

    public Downloader(Document document) {
        this.document = document;
    }

    @Override
    public void run() {
        System.out.println("Downloading file...");
        synchronized (document) {
            String data = "Data is downloaded from: www.google.com";
            document.setData(data);
            document.notifyAll();
        }
    }
}

class Writer extends Thread {
    private Document document;

    public Writer(Document document) {
        this.document = document;
    }

    @Override
    public void run() {
        synchronized (document) {
            while (!document.isReady()) {
                try {
                    document.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Writing document...");
    }


}