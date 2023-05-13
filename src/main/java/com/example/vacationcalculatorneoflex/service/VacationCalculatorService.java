package com.example.vacationcalculatorneoflex.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class VacationCalculatorService {
    public double calculateVacationSalary(double salary, int days) {
        return (salary / 29.3) * days;
    }

//    public double calculateVacationSalaryUsingDate(double salary,
//                                                   LocalDate startDate,
//                                                   LocalDate endDate) {
//        Можно вычитать количество праздников и рассчитать зарплату
//        return ;
//    }

//    public int calculateHolidays(LocalDate startDate,
//                                 LocalDate endDate) {
//        // Можно создать лист из праздников и подсчитывать
//        // сколько праздников в промежутке
//    }
}
