package com.manparvesh.competitivehelper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * This is a utility to create tests for running competitive programming codes directly,
 * without having to create different classes or methods for testing.
 * <p>
 * Using this class, you can directly specify the main method of the class you want to test,
 * the specified input and the expected output.
 * <p>
 * This class can be used for problems in sites like CodeChef, Hackerrank, Codeforces, etc.
 * where you need to submit a complete class that can be run directly
 */
public class MainRunner {
    public static void mainRunner(Runnable mainMethodToBeRun, String input, String output) {
        // setup system.in
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //setup output stream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        // main method should be passed as a param, which will be run now
        mainMethodToBeRun.run();

        // teardown
        System.setIn(System.in);
        System.out.flush();
        System.setOut(System.out);

        // do the checks
        assertEquals(output, baos.toString());
    }
}
