package com.manparvesh.competitivehelper.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.manparvesh.competitivehelper.util.TestCaseReader.*;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution leetcodeSolution;

    @Before
    public void setUp() {
        leetcodeSolution = new Solution();
    }

    /////////////////////////////Integers/////////////////////////////

    private void sampleTestFlowForIntegers(String fileName) throws IOException {
        initReader(fileName);
        int numberOfInputs = readInt();
        int[] inputArray = readIntArray();

        assertEquals(numberOfInputs, inputArray.length);

        // we add this explicitly to the file end instead
        // of writing in the code
        int expectedSum = readInt();

        assertEquals(expectedSum,
                leetcodeSolution.sumOfIntegers(inputArray));

        closeReader();
    }

    @Test
    public void firstTestInt() throws IOException {
        sampleTestFlowForIntegers("com/manparvesh/competitivehelper/leetcode/1.txt");
    }

    @Test
    public void secondTestInt() throws IOException {
        sampleTestFlowForIntegers("com/manparvesh/competitivehelper/leetcode/2.txt");
    }
    /////////////////////////////Integers/////////////////////////////

    /////////////////////////////Strings/////////////////////////////

    private void sampleTestFlowForStrings(String fileName) throws IOException {
        initReader(fileName);
        int numberOfInputs = readInt();
        String[] inputArray = readStringArray();

        assertEquals(numberOfInputs, inputArray.length);

        // we add this explicitly to the file end instead
        // of writing in the code
        String expectedSum = readString();

        assertEquals(expectedSum,
                leetcodeSolution.sumOfStrings(inputArray));

        closeReader();
    }

    @Test
    public void firstTestString() throws IOException {
        sampleTestFlowForStrings("com/manparvesh/competitivehelper/leetcode/3.txt");
    }

    @Test
    public void secondTestString() throws IOException {
        sampleTestFlowForStrings("com/manparvesh/competitivehelper/leetcode/4.txt");
    }
    /////////////////////////////Strings/////////////////////////////

    /////////////////////////////Longs/////////////////////////////
    private void sampleTestFlowForLongs(String fileName) throws IOException {
        initReader(fileName);
        int numberOfInputs = readInt();
        long[] inputArray = readLongArray();

        assertEquals(numberOfInputs, inputArray.length);

        // we add this explicitly to the file end instead
        // of writing in the code
        long expectedSum = readLong();

        assertEquals(expectedSum,
                leetcodeSolution.sumOfLongs(inputArray));

        closeReader();
    }

    @Test
    public void firstTestLong() throws IOException {
        sampleTestFlowForLongs("com/manparvesh/competitivehelper/leetcode/5.txt");
    }

    @Test
    public void secondTestLong() throws IOException {
        sampleTestFlowForLongs("com/manparvesh/competitivehelper/leetcode/6.txt");
    }
    /////////////////////////////Longs/////////////////////////////

    /////////////////////////////Double/////////////////////////////
    private void sampleTestFlowForDoubles(String fileName) throws IOException {
        initReader(fileName);
        int numberOfInputs = readInt();
        double[] inputArray = readDoubleArray();

        assertEquals(numberOfInputs, inputArray.length);

        // we add this explicitly to the file end instead
        // of writing in the code
        double expectedSum = readDouble();

        assertEquals(expectedSum,
                leetcodeSolution.sumOfDoubles(inputArray), 1E-20);

        closeReader();
    }

    @Test
    public void firstTestDouble() throws IOException {
        sampleTestFlowForDoubles("com/manparvesh/competitivehelper/leetcode/7.txt");
    }

    @Test
    public void secondTestDouble() throws IOException {
        sampleTestFlowForDoubles("com/manparvesh/competitivehelper/leetcode/8.txt");
    }
    /////////////////////////////Double/////////////////////////////
}