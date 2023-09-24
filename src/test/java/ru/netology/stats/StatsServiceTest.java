package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSummarySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        long actualSum = service.salesAverage(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 8;
        long actualSum = service.maxSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMixMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 9;
        long actualSum = service.minSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMinAvgMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 5;
        long actualSum = service.minAvgSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMaxAvgMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 5;
        long actualSum = service.maxAvgSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}