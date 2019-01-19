package com.manparvesh.competitivehelper;

import java.io.*;

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
    public static void initReader(String filePathInResources) throws FileNotFoundException {
        ClassLoader classLoader = TestCaseReader.class.getClassLoader();
        File fileToRead = new File(classLoader.getResource(filePathInResources).getFile());
        FileReader fileReader = new FileReader(fileToRead);
        bufferedReader = new BufferedReader(fileReader);
    }

    /**
     * Should be called when you are done reading a file.
     * For a different file, initialize a different reader.
     */
    public static void closeReader() throws IOException {
        bufferedReader.close();
    }

    /**
     * Just string to int converter with a shorter name
     *
     * @param supposedlyInteger String that is supposed to be an integer
     * @return the parsed integer
     */
    private static int readInt(String supposedlyInteger) {
        return Integer.parseInt(supposedlyInteger);
    }

    /**
     * Reads an integer array from the input file
     *
     * @return integer array
     * @throws IOException when there is nothing to read
     */
    public static int[] readIntArray() throws IOException {
        String line;
        int[] intArray;
        if ((line = bufferedReader.readLine()) != null) {
            String sar[] = line.split(" ");
            intArray = new int[sar.length];
            for (int i = 0; i < sar.length; i++) {
                intArray[i] = readInt(sar[i]);
            }
        } else {
            intArray = new int[0];
            System.err.println("File finished. Cannot read anymore.");
        }
        return intArray;
    }

    /**
     * Reads a long array from the input file
     *
     * @return long array
     * @throws IOException when there is nothing to read
     */
    public static long[] readLongArray() throws IOException {
        String line;
        long[] longArray;
        if ((line = bufferedReader.readLine()) != null) {
            String sar[] = line.split(" ");
            longArray = new long[sar.length];
            for (int i = 0; i < sar.length; i++) {
                longArray[i] = Long.parseLong(sar[i]);
            }
        } else {
            longArray = new long[0];
            System.err.println("File finished. Cannot read anymore.");
        }
        return longArray;
    }

    /**
     * Reads a double array from the input file
     *
     * @return double array
     * @throws IOException when there is nothing to read
     */
    public static double[] readDoubleArray() throws IOException {
        String line;
        double[] doubleArray;
        if ((line = bufferedReader.readLine()) != null) {
            String sar[] = line.split(" ");
            doubleArray = new double[sar.length];
            for (int i = 0; i < sar.length; i++) {
                doubleArray[i] = Double.parseDouble(sar[i]);
            }
        } else {
            doubleArray = new double[0];
            System.err.println("File finished. Cannot read anymore.");
        }
        return doubleArray;
    }

    /**
     * Reads a String array from the input file
     *
     * @return String array
     * @throws IOException when there is nothing to read
     */
    public static String[] readStringArray() throws IOException {
        String line;
        String[] stringArray;
        if ((line = bufferedReader.readLine()) != null) {
            stringArray = line.split(" ");
        } else {
            stringArray = new String[0];
            System.err.println("File finished. Cannot read anymore.");
        }
        return stringArray;
    }

    /**
     * Reads an integer from the next line of input
     *
     * @return int
     * @throws IOException when there is nothing to read
     */
    public static int readInt() throws IOException {
        String line;
        int n;
        if ((line = bufferedReader.readLine()) != null) {
            n = readInt(line);
        } else {
            n = 0;
            System.err.println("File finished. Cannot read anymore.");
        }
        return n;
    }


    /**
     * Reads a long from the next line of input
     *
     * @return long
     * @throws IOException when there is nothing to read
     */
    public static long readLong() throws IOException {
        String line;
        long n;
        if ((line = bufferedReader.readLine()) != null) {
            n = Long.parseLong(line);
        } else {
            n = 0;
            System.err.println("File finished. Cannot read anymore.");
        }
        return n;
    }


    /**
     * Reads a double from the next line of input
     *
     * @return double
     * @throws IOException when there is nothing to read
     */
    public static double readDouble() throws IOException {
        String line;
        double n;
        if ((line = bufferedReader.readLine()) != null) {
            n = Double.parseDouble(line);
        } else {
            n = 0;
            System.err.println("File finished. Cannot read anymore.");
        }
        return n;
    }


    /**
     * Reads a String from the next line of input
     *
     * @return string
     * @throws IOException when there is nothing to read
     */
    public static String readString() throws IOException {
        String line;
        if ((line = bufferedReader.readLine()) != null) {
            return line;
        } else {
            System.err.println("File finished. Cannot read anymore.");
            return null;
        }
    }
}
