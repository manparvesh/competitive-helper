package com.manparvesh.competitivehelper.mainrunner;

import com.manparvesh.competitivehelper.MainRunner;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        MainRunner.mainRunner(() -> {
            try {
                Main.main(new String[] {});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, "2\n"
                + "1 2", "3 2\n");
    }

    @Test
    public void test2() {
        MainRunner.mainRunner(() -> {
            try {
                Main.main(new String[] {});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, "5\n"
                + "10 20 30 40 50", "150 5\n");
    }

    @Test
    public void test3() {
        MainRunner.mainRunner(() -> {
            try {
                Main.main(new String[] {});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, "2\n"
                + "1 -1", "0 2\n");
    }
}