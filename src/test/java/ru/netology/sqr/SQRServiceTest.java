package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"200, 500", "0, 99", "501, 10000"})

    void shouldCalculateNumberSqr(int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();
        int actual = service.calculateNumberSqr(lowerLimit, upperLimit);
        int expected = 8;
        assertEquals(expected, actual);
    }

//    @Test
//    void shouldCalculateNumberSqr() {
//        SQRService service = new SQRService();
//        int lowerLimit = 200;
//        int upperLimit = 500;
//        int expected = 8;
//        int actual = service.calculateNumberSqr(lowerLimit, upperLimit);
//
//        assertEquals(expected, actual);
//    }
}