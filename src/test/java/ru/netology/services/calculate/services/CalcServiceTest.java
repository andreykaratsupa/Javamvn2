package ru.netology.services.calculate.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {
    @Test

    public void CalculateHolidayCounter() {

        CalcService service = new CalcService();

        int expected = 2;
        int income = 100_000; // доход от работы
        int expenses = 60_000; // обязательные месячные траты
        int threshold = 150_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}