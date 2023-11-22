package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        isNull(num1);
        isNull(num2);
        return calculatorService.result(num1, num2, "+", calculatorService.plus(num1,num2));
    }
    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2){
        isNull(num1);
        isNull(num2);
        return calculatorService.result(num1, num2, "-", calculatorService.minus(num1,num2));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2){
        isNull(num1);
        isNull(num2);
        return calculatorService.result(num1, num2, "*", calculatorService.multiply(num1,num2));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2){
        isNull(num1);
        isNull(num2);
        return calculatorService.result(num1, num2, "/", calculatorService.divide(num1,num2));
    }
    private void isNull(Integer num) {
        if (num==null)
            throw new NumIsNullException("Переменная не задана");

    }
}
