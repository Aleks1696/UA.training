package self_education.streams;

import java.util.stream.Stream;

public class Example_3 {
    public static void main(String[] args) {
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));

        Stream.of(0, 3, 0, 0, 5)
                .distinct()
                .forEachOrdered(System.out::println);
    }
}
