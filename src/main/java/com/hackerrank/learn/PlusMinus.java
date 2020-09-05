package com.hackerrank.learn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        double positive = 0;
        double negative = 0;
        double zeros = 0;

        for (int n : arr) {
            if (n < 0) {
                negative += 1;
            } else if (n == 0) {
                zeros += 1;
            } else {
                positive += 1;
            }
        }
        System.out.println(df.format(positive / arr.length));
        System.out.println(df.format(negative / arr.length));
        System.out.println(df.format(zeros / arr.length));
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
