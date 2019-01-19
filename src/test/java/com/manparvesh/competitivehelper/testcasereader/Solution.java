package com.manparvesh.competitivehelper.testcasereader;

class Solution {
    int sumOfIntegers(int[] ar) {
        int sum = 0;
        for (int n : ar) {
            sum += n;
        }
        return sum;
    }

    long sumOfLongs(long[] ar) {
        long sum = 0;
        for (long n : ar) {
            sum += n;
        }
        return sum;
    }

    String sumOfStrings(String[] ar) {
        StringBuilder sum = new StringBuilder();
        for (String n : ar) {
            sum.append(n);
        }
        return sum.toString();
    }

    double sumOfDoubles(double[] ar) {
        double sum = 0;
        for (double n : ar) {
            sum += n;
        }
        return sum;
    }
}
