package com.manparvesh.competitivehelper.mainrunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> ar = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        long sum = ar.stream().mapToInt(Integer::intValue).sum();

        out.println(sum + " " + n);

        bufferedReader.close();
        out.close();
    }
}
