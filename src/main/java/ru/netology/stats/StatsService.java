package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum +=sale;
        }
        return sum;
    }

    public long salesAverage(long[] sales) {
          return salesAmount(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAvgSales(long[] sales) {
        int counterMin = 0;
        long averageSale = salesAverage(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
               counterMin++;
            }
        }
        return counterMin;
    }

    public int maxAvgSales(long[] sales) {
        int counterMax = 0;
        long averageSale = salesAverage(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counterMax++;
            }
        }
        return counterMax;
    }
}
