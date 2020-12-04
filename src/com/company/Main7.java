package com.company;

import java.util.stream.IntStream;

public class Main7 {
    public static void main(String[] args) {
        int[] array = {2,34,45,5,6,67,87,78,89,89,89};
        int sum = IntStream.of(array).sum();
        System.out.println(sum);
    }
}
