package com.example.mathservicewithallhttpmethods.controller;

import com.example.mathservicewithallhttpmethods.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/current")
    public double getCurrentValue() {
        return mathService.getCurrentValue();
    }

    @PostMapping("/add")
    public double add(@RequestParam double value) {
        return mathService.add(value);
    }

    @PostMapping("/subtract")
    public double subtract(@RequestParam double value) {
        return mathService.subtract(value);
    }

    @PostMapping("/multiply")
    public double multiply(@RequestParam double value) {
        return mathService.multiply(value);
    }

    @PostMapping("/divide")
    public double divide(@RequestParam double value) {
        return mathService.divide(value);
    }

    @PutMapping("/set")
    public double setValue(@RequestParam double value) {
        return mathService.setValue(value);
    }

    @DeleteMapping("/reset")
    public double resetValue() {
        return mathService.resetValue();
    }
}
