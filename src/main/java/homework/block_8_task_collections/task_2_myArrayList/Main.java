package homework.block_8_task_collections.task_2_myArrayList;

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

    }
}
