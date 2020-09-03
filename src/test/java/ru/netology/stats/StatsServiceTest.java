package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void sumsale() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        int actual = service.sumSales(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void avrgsale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.avrgSale(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void maxsale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

       int actual = service.maxsale(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void minsale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        int actual = service.minsale(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void undersale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual= service.undersale(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void uppersale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual = service.uppersale(month);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
