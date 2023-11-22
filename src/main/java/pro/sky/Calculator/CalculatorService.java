package pro.sky.Calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer num1, Integer num2) {
        return num1+num2;
    }
    public Integer minus(Integer num1, Integer num2) {
        return num1-num2;
    }
    public Integer multiply(Integer num1, Integer num2) {
        return num1*num2;
    }
    public Integer divide(Integer num1, Integer num2) {
        if (num2==0) {
            throw new IllegalArgumentException("Попытка деления на 0");
        }
        return num1/num2;
    }
    public String result (Integer num1, Integer num2, String operation, Integer result) {
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" ");
        str.append(operation);
        str.append(" ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }
}
