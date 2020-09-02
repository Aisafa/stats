package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumSales(int month[]) {
        int sum = Arrays.stream(month).sum();
        return sum;
    }

    public int avrgSale(int month[]) {
        int sum = 0;
        for (int x : month) {
            sum += x;
        }
        int average = sum / month.length;
        return average;
    }

    public int maxsale(int month[]) {
        int max = month[0];
        int imax = 0;
        for (int i = 0; i < month.length; i++) {

            if (max < month[i]) {
                max = month[i];
                imax = i;
            }
        }
        int iimax = imax + 1;
        return (int) iimax;

    }

    public int minsale(int month[]) {
        int min = month[0];
        int imin = 0;
        for (int i = 0; i < month.length; i++) {

            if (min > month[i]) {
                min = month[i];
                imin = i;
            }
        }
        int iimin = imin + 1;
        return (int) iimin;
    }

    public int undersale(int month[]) {
        int sum = 0;
        for (int x : month) {
            sum += x;
        }
        int average = sum / month.length;

        int counter = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < average) {
                counter++;
            }
        }
        return counter;
    }

    public int uppersale(int month[]) {
        int sum = 0;
        for (int x : month) {
            sum += x;
        }
        int average = sum / month.length;

        int counter = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}




