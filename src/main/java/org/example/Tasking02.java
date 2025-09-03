package org.example;

import java.util.Arrays;

public class Tasking02 {

    public static void main(String[] args) {
        System.out.println(genMultiplicationTable(2, 9));
    }

    private static String genMultiplicationTable(int startNum, int endNum) {
        if(isNotInValidRange(startNum, endNum)) {
            return null;
        }
        if (isStartGreaterThanEnd(startNum, endNum)) {
            return null;
        }
        StringBuilder table = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            String oneLineMultiplication = genOneLineMultiplication(startNum, i);
            table.append(oneLineMultiplication);
        }
        return table.toString();
    }

    private static String genOneLineMultiplication(int start, int end) {
        StringBuilder line = new StringBuilder();
        String expression;
        for(int i = start; i <= end; i++) {
            expression = String.format("%d*%d=%d", i, end, i * end);
            line.append(expression);
            line.append("\t");
        }
        line.append("\n");
        return line.toString();
    }

    private static boolean isStartGreaterThanEnd(int startNum, int endNum) {
        return startNum > endNum;
    }

    private static boolean isNotInValidRange(int startNum, int endNum) {
        return !isInValidRange(startNum, endNum);
    }

    private static boolean isInValidRange(int startNum, int endNum) {
        return startNum >= 1 && startNum <= 1000 && endNum >= 1 && endNum <= 1000;
    }
}
