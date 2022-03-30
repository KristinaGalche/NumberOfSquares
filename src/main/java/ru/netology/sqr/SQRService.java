package ru.netology.sqr;

public class SQRService {

    public static void main(String[] args) {
        int lowerLimit = 200;
        int upperLimit = 500;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateNumberSqr(lowerLimit, upperLimit));
    }

    public int calculateNumberSqr(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                count++;
            }
        }
        return count;
    }

}
