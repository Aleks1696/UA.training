package self_education.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
    private Map<String, Operator> operators = new HashMap<>();
    public Operator getOperator(String number) {
        String operatorCode = number.substring(0,3);
        Operator operator = operators.get(operatorCode);
        if (operator == null) {
            switch (operatorCode) {
                case "063": {
                    operator = new Lifecell();
                    break;
                }
                case "050": {
                    operator = new Vodafon();
                    break;
                }
                case "098": {
                    operator = new Kyivstar();
                    break;
                }
            }
            operators.put(operatorCode, operator);
        }
        operator.sendSMS(number);
        System.out.println(operators.size());
        return operator;
    }
}
