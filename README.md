<div align="center">
  <h1>competitive-helper</h1>

  <a href="https://travis-ci.org/manparvesh/competitive-helper/builds" target="_blank"><img src="https://img.shields.io/travis/manparvesh/competitive-helper.svg?style=for-the-badge" alt="Build Status"></a> 
  <a href="https://manparvesh.mit-license.org/" target="_blank"><img src="https://img.shields.io/badge/license-MIT-blue.svg?longCache=true&style=for-the-badge" alt="License"></a>
  <p>A helper package to help test codes written in competitive programming</p>
</div>


## Purpose
This package was made in the light of getting things done faster while doing competitive programming. Basically, you can use it to test your code quickly on your own machine before submitting on a platform. This is only for Java 8 and above.

## How to use
- Clone this repo and open in an editor like IntelliJ or Eclipse.
- For websites like Leetcode, where you need to submit a specific method that is later used by the online judge to check the solution:
  - While writing tests for your class, import the `TestCaseReader` class and use the following flow:
    - Initialize the test case file.
    - Read file contents as you like.
    - Close the reader.
  - Sample test: [SolutionTest](https://github.com/manparvesh/competitive-helper/blob/master/src/test/java/com/manparvesh/competitivehelper/testcasereader/SolutionTest.java)
- For websites like CodeChef, Hackerrank, Codeforces, etc., where you need to submit the complete Java class with a `main` method:
  - While writing tests for your class, simply import the `MainRunner` class and use the `mainRunner` static method inside it. Just pass the following methods to this method, and that's it:
    - Main method of the class you want to test
    - Specified input
    - Expected output
  - Sample test: [MainTest](https://github.com/manparvesh/competitive-helper/blob/master/src/test/java/com/manparvesh/competitivehelper/mainrunner/MainTest.java)

## Provided API

### 1. For `TestCaseReader`

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

### 2. For `MainRunner`

```java
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
    /**
     * @param mainMethodToBeRun the method you need to test
     * @param input provided input
     * @param output expected output
     */
    public static void mainRunner(Runnable mainMethodToBeRun, String input, String output);
}
```

## License

```
MIT License

Copyright (c) 2018 Man Parvesh Singh Randhawa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
