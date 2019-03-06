package homework.block_8_task_collections;

import java.util.*;

public class Task1_CountElements {
    public static void main(String[] args) {
        List<Integer> elementsList = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        Task1_CountElements task = new Task1_CountElements();
        task.printResult(task.countElementRepeats(elementsList));
    }

    public <T> Map<T, Integer> countElementRepeats(List<T> elementsList) {
        Map<T, Integer> resultMap = new Hashtable<>();
        for (T element : elementsList) {
            if (!resultMap.containsKey(element)) {
                resultMap.put(element, 1);
            } else {
                int temp = resultMap.get(element);
                resultMap.replace(element, ++temp);
            }
        }
        return resultMap;
    }

    public void printResult(Map mapToPrint) {
        System.out.println(mapToPrint);
    }


}
