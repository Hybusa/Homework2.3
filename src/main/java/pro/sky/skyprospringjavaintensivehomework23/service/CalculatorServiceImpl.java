package pro.sky.skyprospringjavaintensivehomework23.service;

import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public Integer add(Integer a, Integer b) {
        checkForNull(a, b);
        return (a + b);
    }

    public Integer subtract(Integer a, Integer b) {
        checkForNull(a, b);
        return (a - b);
    }


    public Double pow(Integer a, Integer b) {
        checkForNull(a, b);
        return (Math.pow(a, b));
    }


    public Double divide(Integer a, Integer b) {
        checkForNull(a, b);
        if (b == 0)
            throw new InputMismatchException("Can't divide by 0");
        return  ((double) a / b);
    }


    public Integer multiply(Integer a, Integer b) {
        checkForNull(a, b);
        return (a * b);
    }

    private void checkForNull(Integer a, Integer b)
    {
        if(a == null || b == null)
         throw new InputMismatchException("Number must have a value");
    }
}
