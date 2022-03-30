package ru.netology.sqr;

public class SQRService {
    public int sqrCeil(int num1, int num2) {
        int counter = 1;
        for (int i = 10; i <= 99; i++) {
            counter++;

            if (num1 <= i * i && i * i <= num2) {

                return counter;
            }
        }
        return 0;
    }


}
