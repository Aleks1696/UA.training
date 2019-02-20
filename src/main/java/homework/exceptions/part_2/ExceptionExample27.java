package homework.exceptions.part_2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample27 {
    public static void main(String[] args) {
       Demo.test(new Child());
    }
}

class Parent {
    void f() throws IOException {
        throw new IOException();
    }
}

//Child can not throw more general exception
class Child extends Parent {
//    @Override
//    void f() throws Exception {
//        throw new Exception();
//    }
}

class Demo {
    //what is going to happen if we pass Child here that throws checked! 'Exception'
    static void test(Parent parent) {
        try {
            parent.f();
        } catch (IOException e){
            System.out.println("IOException from parent is expected");
        }
    }
}
