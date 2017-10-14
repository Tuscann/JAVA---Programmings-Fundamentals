package com.company;

import java.io.BufferedReader;  // 100/100
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class l_03_Min_Max_Sum_Average2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int[] myArr = new int[number];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Integer.parseInt(reader.readLine());
        }

        Double average = 1.0d * IntStream.of(myArr).sum() / myArr.length;

        System.out.println("Sum = " + IntStream.of(myArr).sum());
        System.out.println("Min = " + GetMinValue(myArr));
        System.out.println("Max = " + GetMaxValue(myArr));
        System.out.println("Average = " + average);
    }

    private static int GetMaxValue(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    private static int GetMinValue(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
