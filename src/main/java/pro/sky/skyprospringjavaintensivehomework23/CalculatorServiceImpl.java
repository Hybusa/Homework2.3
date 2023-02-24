package pro.sky.skyprospringjavaintensivehomework23;

import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String add(int a, int b) {
        return a + "+" + b + "=" + (a + b);
    }

    public String subtract(int a, int b) {
        return a + "-" + b + "=" + (a - b);
    }


    public String pow(int a, int b) {
        return a + "^" + b + "=" + (Math.pow(a, b));
    }


    public String divide(int a, int b) {
        if (b == 0)
            throw new InputMismatchException("Can't divide by 0");
        return a + "/" + b + "=" + ((double)a / b);
    }


    public String multiply(int a, int b) {
        return a + "*" + b + "=" + (a * b);
    }

}
