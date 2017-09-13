package com.company;

import com.sun.jmx.snmp.SnmpUnsignedInt;

import java.util.Scanner;            // 100/100

public class _01_Type_Boundaries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(Integer.MAX_VALUE);
                System.out.println(Integer.MIN_VALUE);
                break;
            case "uint":
                System.out.println(SnmpUnsignedInt.MAX_VALUE);
                System.out.println(0);
                break;
            case "long":
                System.out.println(Long.MAX_VALUE);
                System.out.println(Long.MIN_VALUE);
                break;
            case "byte":
                System.out.println(255);
                System.out.println(0);
                break;
            case "sbyte":
                System.out.println(Byte.MAX_VALUE);
                System.out.println(Byte.MIN_VALUE);
                break;
        }
    }
}
