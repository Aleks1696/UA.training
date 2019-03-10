package self_education.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
