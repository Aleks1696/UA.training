package self_education.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("2");
        list.add("345");
        list.add("46");
        list.add("5");

        List<String> result = list.stream().filter(s -> s.length() >= 2).collect(Collectors.toList());
        System.out.println(result);
    }
}
