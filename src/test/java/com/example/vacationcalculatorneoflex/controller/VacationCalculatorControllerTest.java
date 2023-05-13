package com.example.vacationcalculatorneoflex.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VacationCalculatorControllerTest {
    @Autowired
    private VacationCalculatorController calculatorController;

    @Test
    public void testVacationCalculator() {
        double salary = 100000;
        int vacationDays = 45;
        double expectedVal = (salary / 29.3) * vacationDays;

        double res = calculatorController.getVacationSalary(salary, vacationDays);
        assertEquals(expectedVal, res);
    }
}