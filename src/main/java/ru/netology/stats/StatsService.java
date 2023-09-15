package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int salesAverage(int[] sales) {

        int avg = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            avg = sum / 12;
        }
        return avg;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAvgSales(int[] sales) {
        int minMonths = 0;
        int avg = 0;
        int sum = 0;
        int countMin = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            avg = sum / 12;
            if (sales[i] < 15) {
                minMonths = sales[i];
                countMin++;
            }
        }
        return countMin;
    }

    public int maxAvgSales(int[] sales) {
        int maxMonths = 0;
        int avg = 0;
        int sum = 0;
        int countMax = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            avg = sum / 12;
            if (sales[i] < 15) {
                maxMonths = sales[i];
                countMax++;
            }
        }
        return countMax;
    }
}
