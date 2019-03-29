package self_education.streams;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

public class Example_2 {
    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]
    }
}

class Human {
    private final String name;
    private final List<String> pets;
    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }
    public String getName() {
        return name;
    }
    public List<String> getPets() {
        return pets;
    }
}