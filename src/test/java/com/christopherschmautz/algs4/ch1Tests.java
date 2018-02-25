package com.christopherschmautz.algs4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ch1Tests {

    @Test
    public void ex111aTest() {

        assertTrue(
                "Should have been 7!",
                (ch1.ex111a() == 7)

        );
    }

    @Test
    public void ex111bTest() {

        assertTrue(
                "Should have been 495750.4358290221!",
                (ch1.ex111b() == 495750.4358290221)

        );
    }

    @Test
    public void ex111cTest() {

        assertTrue(
                "Should have been true!",
                (ch1.ex111c())

        );
    }

}
