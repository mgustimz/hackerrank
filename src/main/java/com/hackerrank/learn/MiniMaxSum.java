package com.hackerrank.learn;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                max += arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                min += arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
