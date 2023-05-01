package Leetcode;

import java.util.*;

class solution {
    public double average(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int count = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max != arr[i] && min != arr[i]) {
                sum += arr[i];
                count++;
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] a = { 4000, 3000, 1000, 2000 };
        solution object = new solution();
        System.out.println(object.average(a));
    }
}