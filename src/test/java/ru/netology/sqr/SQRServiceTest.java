package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void sqrCalculate() {
        SQRService Service = new SQRService();
        int num1 = 100;
        int num2 = 300;

        int expected = 2;

        int actual = Service.sqrCeil(num1, num2);

        assertEquals(expected, actual);
    }
    @Test
    public void sqrBoundaryValues() {
        SQRService Service = new SQRService();
        int num1 = 150;
        int num2 = 200;

        int expected = 5;

        int actual = Service.sqrCeil(num1, num2);

        assertEquals(expected, actual);
    }
    @Test
    public void sqrUnderBoundaryValues() {
        SQRService Service = new SQRService();

            int num1 = 200;
            int num2 = 300;

            int expected = 7;

            int actual = Service.sqrCeil(num1, num2);

            assertEquals(expected, actual);
        }
    }