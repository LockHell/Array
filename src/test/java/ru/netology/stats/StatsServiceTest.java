package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void testAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;
        long actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSalesMonth = 7;
        int actualMaxSalesMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void testBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageSales = 5;
        int actualBelowAverageSales = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);
    }

    @Test
    public void testAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);
    }
}
