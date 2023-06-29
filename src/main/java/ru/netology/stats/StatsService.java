package ru.netology.stats;

public class StatsService {

    public long getSalesSum(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sales[i] + sum);

        }
        return sum;

    }

    public long getSalesAverage(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sales[i] + sum);

        }
        return sum / sales.length;
    }

    public int getMaxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {

        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;

        }
        return minMonth + 1;
    }

    public long getMonthsBelowAverage(long[] sales) {

        long count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getSalesAverage(sales)) {

                count = count + 1;

            }
        }
        return count;

    }
    public long getMonthsOverAverage(long[] sales) {

        long count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getSalesAverage(sales)) {

                count = count + 1;

            }
        }
        return count;

    }
}


