# competitive-helper
A helper package to help test codes written in competitive programming

## Purpose
This package was made in the light of getting things done faster while doing competitive programming. Basically, you can use it to test your code quickly on your own machine before submitting on a platform. This is only for Java.

## How to use
- Clone this repo and open in an editor like IntelliJ or Eclipse.
- While writing tests for your class, import the `TestCaseReader` class and use the following methods:
  - Initialize the test case file.
  - Read file contents as you like.
  - Close the reader.

## Provided API
```java
public class TestCaseReader {
    /**
     * Private global variable to be used while reading a test case file.
     */
    private static BufferedReader bufferedReader;

    /**
     * Initializes the bufferedReader object so that you can start reading it.
     * This is supposed to be the first step while starting to read a test case file.
     *
     * @param filePathInResources file path in resources
     * @throws FileNotFoundException when no file is found
     */
    public static void initReader(String filePathInResources) throws FileNotFoundException;

    /**
     * Should be called when you are done reading a file.
     * For a different file, initialize a different reader.
     */
    public static void closeReader() throws IOException;

    /**
     * Reads an integer array from the input file
     *
     * @return integer array
     * @throws IOException when there is nothing to read
     */
    public static int[] readIntArray() throws IOException;

    /**
     * Reads a long array from the input file
     *
     * @return long array
     * @throws IOException when there is nothing to read
     */
    public static long[] readLongArray() throws IOException;

    /**
     * Reads a double array from the input file
     *
     * @return double array
     * @throws IOException when there is nothing to read
     */
    public static double[] readDoubleArray() throws IOException;

    /**
     * Reads a String array from the input file
     *
     * @return String array
     * @throws IOException when there is nothing to read
     */
    public static String[] readStringArray() throws IOException;

    /**
     * Reads an integer from the next line of input
     *
     * @return int
     * @throws IOException when there is nothing to read
     */
    public static int readInt() throws IOException;



    /**
     * Reads a long from the next line of input
     *
     * @return long
     * @throws IOException when there is nothing to read
     */
    public static long readLong() throws IOException;



    /**
     * Reads a double from the next line of input
     *
     * @return double
     * @throws IOException when there is nothing to read
     */
    public static double readDouble() throws IOException;



    /**
     * Reads a String from the next line of input
     *
     * @return string
     * @throws IOException when there is nothing to read
     */
    public static int readString() throws IOException;
}
```
