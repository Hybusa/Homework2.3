package pro.sky.skyprospringjavaintensivehomework23.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringjavaintensivehomework23.service.CalculatorService;

@RestController
@RequestMapping(path ="/calculator")
public class CalculatorController{

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator(){
        return "Welcome to the calculator";
    }

    @GetMapping(path="plus")
    public String add(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return num1Input
                + "+"
                + num2Input
                + "="
                + calculatorService.add(num1Input,num2Input);
    }

    @GetMapping(path="minus")
    public String subtract(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return num1Input
                + "-"
                + num2Input
                + "="
                + calculatorService.subtract(num1Input,num2Input);
    }

    @GetMapping(path="multiply")
    public String multiply(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return num1Input
                + "*"
                + num2Input
                + "="
                + calculatorService.multiply(num1Input,num2Input);
    }

    @GetMapping(path="pow")
    public String pow(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return num1Input
                + "^"
                + num2Input
                + "="
                + calculatorService.pow(num1Input,num2Input);
    }

    @GetMapping(path="divide")
    public String divide(@RequestParam("num1") int num1Input,@RequestParam("num2") int num2Input){
        return num1Input
                + "/"
                + num2Input
                + "="
                + calculatorService.divide(num1Input,num2Input);
    }
}
