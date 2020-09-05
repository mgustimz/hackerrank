package com.hackerrank.learn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

    private static final Scanner scan = new Scanner(System.in);

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = null;
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
        try {
            result = date24Format.format(date12Format.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
