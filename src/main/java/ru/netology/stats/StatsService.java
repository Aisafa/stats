package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumSales(int month[]) {
        int sum = Arrays.stream(month).sum();
        return sum;
    }

    public double avrgSale(int month[]) {
        double sum = 0;
        for (int x : month) {
            sum += x;
        }
        double average = sum / month.length;
        return average;
    }

    public int maxsale(int[] month) {
        int max = month[0];
        int imax = 0;
        for (int i = 1; i < month.length;i++) {

            if (max <= month[i]) {
                max = month[i];
                imax = i;
            }
        }
        return imax + 1;
    }

    public int minsale(int[] month) {
        int min = month[0];
        int imin = 0;
        for (int i = 1; i < month.length; i++) {

            if (min >= month[i]) {
                min = month[i];
                imin = i;
            }
        }

        return imin + 1;
    }

    public int undersale(int month[]) {
               int counter = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < avrgSale(month)) {
                counter++;
            }
        }
        return counter;
    }

    public int uppersale(int month[]) {

        int counter = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > avrgSale(month)) {
                counter++;
            }
        }
        return counter;
    }
}




