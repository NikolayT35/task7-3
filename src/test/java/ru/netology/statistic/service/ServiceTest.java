package ru.netology.statistic.service;

import org.junit.jupiter.api.Test;
import ru.netology.statistic.Service.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {

    @Test
    void findMax() {
        Service service = new Service();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMax1() {
        Service service = new Service();

        long[] incomesInBillions = {12, 5, 8, 44, 5, 3, 8, 6, 11, 11, 12};
        long expected = 44;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}