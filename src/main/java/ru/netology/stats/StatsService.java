package ru.netology.stats;


public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long averageSalesAmount(long[] sales) {
        long salesAmount = sumOfAllSales(sales) / 12;
        return salesAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        long belowMonth = averageSalesAmount(sales);
        int amtMin = 0;
        for (long sale : sales) {
            if (sale < belowMonth) {
                amtMin++;
            }
        }
        return amtMin;
    }

    public int aboveAverageSales(long[] sales) {
        long aboveMonth = averageSalesAmount(sales);
        int amtMax = 0;
        for (long sale : sales) {
            if (sale > aboveMonth) {
                amtMax++;
            }
        }
        return amtMax;
    }
}