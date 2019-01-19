package com.manparvesh.competitivehelper.testcasereader;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.manparvesh.competitivehelper.TestCaseReader.closeReader;
import static com.manparvesh.competitivehelper.TestCaseReader.initReader;
import static com.manparvesh.competitivehelper.TestCaseReader.readDouble;
import static com.manparvesh.competitivehelper.TestCaseReader.readDoubleArray;
import static com.manparvesh.competitivehelper.TestCaseReader.readInt;
import static com.manparvesh.competitivehelper.TestCaseReader.readIntArray;
import static com.manparvesh.competitivehelper.TestCaseReader.readLong;
import static com.manparvesh.competitivehelper.TestCaseReader.readLongArray;
import static com.manparvesh.competitivehelper.TestCaseReader.readString;
import static com.manparvesh.competitivehelper.TestCaseReader.readStringArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution Solution;

    @Before
    public void setUp() {
        Solution = new Solution();
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
                Solution.sumOfIntegers(inputArray));

        closeReader();
    }

    @Test
    public void firstTestInt() throws IOException {
        sampleTestFlowForIntegers("com/manparvesh/competitivehelper/testcasereader/1.txt");
    }

    @Test
    public void secondTestInt() throws IOException {
        sampleTestFlowForIntegers("com/manparvesh/competitivehelper/testcasereader/2.txt");
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
                Solution.sumOfStrings(inputArray));

        closeReader();
    }

    @Test
    public void firstTestString() throws IOException {
        sampleTestFlowForStrings("com/manparvesh/competitivehelper/testcasereader/3.txt");
    }

    @Test
    public void secondTestString() throws IOException {
        sampleTestFlowForStrings("com/manparvesh/competitivehelper/testcasereader/4.txt");
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
                Solution.sumOfLongs(inputArray));

        closeReader();
    }

    @Test
    public void firstTestLong() throws IOException {
        sampleTestFlowForLongs("com/manparvesh/competitivehelper/testcasereader/5.txt");
    }

    @Test
    public void secondTestLong() throws IOException {
        sampleTestFlowForLongs("com/manparvesh/competitivehelper/testcasereader/6.txt");
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
                Solution.sumOfDoubles(inputArray), 1E-20);

        closeReader();
    }

    @Test
    public void firstTestDouble() throws IOException {
        sampleTestFlowForDoubles("com/manparvesh/competitivehelper/testcasereader/7.txt");
    }

    @Test
    public void secondTestDouble() throws IOException {
        sampleTestFlowForDoubles("com/manparvesh/competitivehelper/testcasereader/8.txt");
    }
    /////////////////////////////Double/////////////////////////////
}