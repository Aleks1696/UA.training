package homework.block_8_task_collections.task_myLinkedList;

public class Main {
    public static void main(String[] args) {
        Linked<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        list.addFirst(1);
        System.out.println(list);
        System.out.println(list.getLast());
        list.addLast(2);
        list.addFirst(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
