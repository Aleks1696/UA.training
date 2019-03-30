package homework.block_11_task_patterns.state;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setState(new NearTheRiver());
        human1.doAction();
        System.out.println("---------------------------------");
        human1.setState(new NearMushroomGlade(), new SeeAnimal());
        human1.doAction();
    }
}
