package org.example;

import java.util.Arrays;

public class Tasking01 {

    public static void main(String[] args) {
        System.out.println("Does the biggest even number is greater than 10?");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(checkGreaterThan10(numbers));
    }

    private static boolean checkGreaterThan10(int[] numbers) {
        int[] evenNums = findEvenNums(numbers);
        int biggestNum = findBiggestNum(evenNums);
        return biggestNum > 10;
    }

    private static int findBiggestNum(int[] evens) {
        return Arrays.stream(evens).max().orElse(Integer.MIN_VALUE);
    }

    private static int[] findEvenNums(int[] numbers) {
        return Arrays.stream(numbers).filter(num -> num % 2 == 0).toArray();
    }
}
