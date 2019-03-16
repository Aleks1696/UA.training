package homework.block_8_task_collections.task_myArrayList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("1-st");
        myList.add("2-nd");
        myList.add("3-nd");
        myList.add("4-th");

        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
