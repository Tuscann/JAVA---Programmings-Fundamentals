package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;           // 100/100

public class _04_Tourist_Information {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String imperialUnit = scanner.nextLine();
        double imperialValue = Double.parseDouble(scanner.nextLine());
        String metricUnit = "";
        double result = 0.0;
        switch (imperialUnit) {
            case "miles":
                result = imperialValue * 1.6;
                metricUnit = "kilometers";
                break;
            case "inches":
                result = imperialValue * 2.54;
                metricUnit = "centimeters";
                break;
            case "feet":
                result = imperialValue * 30;
                metricUnit = "centimeters";
                break;
            case "yards":
                result = imperialValue * 0.91;
                metricUnit = "meters";
                break;
            case "gallons":
                result = imperialValue * 3.8;
                metricUnit = "liters";
                break;
        }

        DecimalFormat df = new DecimalFormat("0");
        df.setMaximumFractionDigits(15);
        System.out.printf("%s %s = %.2f %s", df.format(imperialValue), imperialUnit, result, metricUnit);

    }
}
