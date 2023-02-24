package pro.sky.skyprospringjavaintensivehomework23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController{

    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path ="/calculator")
    public String calculator(){
        return "Welcome to the calculator";
    }

    @GetMapping(path ="/calculator/plus")
    public String add(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return calculatorService.add(num1Input,num2Input);
    }

    @GetMapping(path ="/calculator/minus")
    public String subtract(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return calculatorService.subtract(num1Input,num2Input);
    }

    @GetMapping(path ="/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return calculatorService.multiply(num1Input,num2Input);
    }

    @GetMapping(path ="/calculator/pow")
    public String pow(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return calculatorService.pow(num1Input,num2Input);
    }

    @GetMapping(path ="/calculator/divide")
    public String divide(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return calculatorService.divide(num1Input,num2Input);
    }
}
