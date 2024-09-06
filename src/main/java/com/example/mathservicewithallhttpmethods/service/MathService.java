package com.example.mathservicewithallhttpmethods.service;

import com.example.mathservicewithallhttpmethods.repository.MathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Autowired
    private MathRepository mathRepository;

    public double getCurrentValue() {
        return mathRepository.getCurrentValue();
    }

    public double add(double value) {
        double result = mathRepository.getCurrentValue() + value;
        mathRepository.setCurrentValue(result);
        return result;
    }

    public double subtract(double value) {
        double result = mathRepository.getCurrentValue() - value;
        mathRepository.setCurrentValue(result);
        return result;
    }

    public double multiply(double value) {
        double result = mathRepository.getCurrentValue() * value;
        mathRepository.setCurrentValue(result);
        return result;
    }

    public double divide(double value) {
        if (value == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = mathRepository.getCurrentValue() / value;
        mathRepository.setCurrentValue(result);
        return result;
    }

    public double setValue(double value) {
        mathRepository.setCurrentValue(value);
        return value;
    }

    public double resetValue() {
        mathRepository.resetValue();
        return mathRepository.getCurrentValue();
    }
}

