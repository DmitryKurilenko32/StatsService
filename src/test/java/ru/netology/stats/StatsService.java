package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth;
    }

    public int generalSumSales(long[] sales) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < sales.length; i++) {

            sum = (int) (sum + sales[i]);

        }
        return sum;


    }

    public double averageSum(long[] sales) {
        double sum = generalSumSales(sales);
        double average = sum / sales.length;
        return average;
    }

    public int monthBelowAverege(long[] sales) {
        double average = averageSum(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                month = month + 1;
            }
        }
        return month;
    }

    public int monthAboveAverege(long[] sales) {
        double average = averageSum(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month = month + 1;
            }
        }
        return month;
    }
}
