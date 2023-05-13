package com.example.vacationcalculatorneoflex.controller;

import com.example.vacationcalculatorneoflex.service.VacationCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class VacationCalculatorController {
    @Autowired
    VacationCalculatorService calculatorService;
    @GetMapping("/calculate")
    public double getVacationSalary(@RequestParam double salary,
                                    @RequestParam int vacationLength) {
        double vacationSalary = calculatorService.calculateVacationSalary(salary, vacationLength);
        return vacationSalary;
    }

//    @GetMapping("/calculate")
//    public double getVacationSalary(@RequestParam double salary,
//                                    @RequestParam LocalDate startDate,
//                                    @RequestParam LocalDate endDate) {
//        double vacationSalary = calculatorService.calculateVacationSalaryUsingDate(salary, startDate, endDate);
//        return vacationSalary;
//    }

}
