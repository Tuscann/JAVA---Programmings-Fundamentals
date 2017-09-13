package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class l_06_Fold_and_Sum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));

        int k = numbers.size() / 4;

        List<Integer> leftUpper = numbers.stream().limit(k).collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(leftUpper);

        Collections.reverse(numbers);
        List<Integer> rightUpper = numbers.stream().limit(k).collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(numbers);

        List<Integer> downList = numbers.stream().skip(k).limit(k * 2).collect(Collectors.toCollection(ArrayList::new));

        leftUpper.addAll(rightUpper);

        for (int i = 0; i < downList.size(); i++) {
            downList.set(i, downList.get(i) + leftUpper.get(i));
        }

        System.out.println(downList.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}

