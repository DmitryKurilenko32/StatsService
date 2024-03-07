package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i;
            }
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
    public int

}