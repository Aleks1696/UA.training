package self_education.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperatorFactory factory = new OperatorFactory();
        List<Operator> operators = new ArrayList<>();
        operators.add(factory.getOperator("0983443321"));
        operators.add(factory.getOperator("0633443321"));
        operators.add(factory.getOperator("0633443321"));
        operators.add(factory.getOperator("0503443321"));
        operators.add(factory.getOperator("0983443321"));
        operators.add(factory.getOperator("0983443321"));
        operators.add(factory.getOperator("0633443321"));

    }
}
