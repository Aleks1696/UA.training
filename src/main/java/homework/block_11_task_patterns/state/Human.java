package homework.block_11_task_patterns.state;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human {
    private List<Role> role;
    private List<State> state;

    public Human() {
        role = new ArrayList<>();
        state = new ArrayList<>();
    }

    public void doAction() {
        state.forEach(s -> s.doSomething(this));
    }

    public void setState(State state) {
        this.state.clear();
        this.state.add(state);
    }
    public void setState(State ... state) {
        this.state.clear();
        this.state.addAll(Arrays.asList(state));
    }
    public void setRole(Role ... role) {
        this.role.clear();
        this.role.addAll(Arrays.asList(role));
    }
    public void setRole(Role role) {
        this.role.clear();
        this.role.add(role);
    }
    public List<Role> getRole() {
        return role;
    }
}

enum Role {
    HUNTER, FISHER, MUSHROOMER
}

interface State {
    void doSomething(Human human);
}

class NearTheRiver implements State {
    public void doSomething(Human human) {
        human.setRole(Role.FISHER);
        System.out.println("I'm a " + human.getRole() + " and I'm fishing...");
    }
}

class NearMushroomGlade implements State {
    public void doSomething(Human human) {
        human.setRole(Role.MUSHROOMER);
        System.out.println("I'm a " + human.getRole() + " and I'm looking for funny mushrooms...");
    }
}

class SeeAnimal implements State {
    public void doSomething(Human human) {
        human.setRole(Role.HUNTER);
        System.out.println("I'm a " + human.getRole() + " and I'm tracing a prey...");
    }
}