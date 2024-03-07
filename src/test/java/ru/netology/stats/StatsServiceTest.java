package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void testMaxMonth() {
        StatsService service = new StatsService();
        long[] sum = {20, 40, 80, 166, 1, 23, 55, 33, 45, 90, 56, 54};
        long expectedMaxMonth = 3;
        long actualMaxMonth = service.maxSales(sum);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void testMinMonth() {
        StatsService service = new StatsService();
        long[] sum = {20, 40, 80, 166, 1, 23, 55, 33, 45, 90, 56, 54};
        long expectedMaxMonth = 4;
        long actualMaxMonth = service.minSales(sum);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void testGeneralSum() {
        StatsService service = new StatsService();
        long[] sum = {20, 40, 80, 166, 1, 23, 55, 33, 45, 90, 56, 54};
        long expectedGeneralSum = 663;
        long actualGeneralSum = service.generalSumSales(sum);
        Assertions.assertEquals(expectedGeneralSum, actualGeneralSum);
    }
}