package ru.netology.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest{
    @Test
    void ShouldCalculateRest(){
        MonthService service = new MonthService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void ShouldCalculateRestWithAnotherNumb(){
        MonthService service = new MonthService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}