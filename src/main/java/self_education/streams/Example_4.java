package self_education.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_4 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("Jerry", "Amanda"));
        lists.add(Arrays.asList("David", "Carolin"));
        lists.add(Arrays.asList("Terry", "Lori"));

        lists.stream()
                .flatMap(strings -> strings.stream())
                .forEach(System.out::println);
    }
}
