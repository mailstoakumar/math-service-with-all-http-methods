package com.example.mathservicewithallhttpmethods.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MathRepository {

    private double currentValue = 0.0; // Initial value

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double value) {
        this.currentValue = value;
    }

    public void resetValue() {
        this.currentValue = 0.0;
    }
}

