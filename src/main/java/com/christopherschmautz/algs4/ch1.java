package com.christopherschmautz.algs4;

import edu.princeton.cs.algs4.StdOut;

public class ch1 {

    // Exercise 1.1.1 - logic output
    public static int ex111a() {
        return (0 + 15) / 2;
    }

    public static double ex111b() {
        return ((2.0) * Math.exp(-6) * 100000000.1);
    }

    public static boolean ex111c() {
        return (true && false || true && true);
    }

    // Exercise 1.1.2 - logic output and type
    public static Object ex112a() {
        return (1 + 2.236) / 2;
    }

    public static Object ex112b() {
        return 1 + 2 + 3 + 4.0;
    }

    public static Object ex112c() {
        return 1 + 2 + "3";
    }

    // Exercise 1.1.3
    public static String doThreeEqual(int... args) {
        StdOut.println("doThreeEqual(): ");

        if (args.length != 3)
            throw new IllegalArgumentException("This program only takes in 3 integer inputs!");

        if (args[0] == args[1] && args[0] == args[2] && args[1] == args[2])
            return "equal";
        else
            return "not equal";
    }

    // Exercise 1.1.4 - skipped do to open nature of response
    // the examples will be given here - comment out to inspect compilation issues, if any
    public static void whatsWrong(int a, int b) {
        int c;

//        if (a > b) then c = 0; // hint: 'then' keyword

//        if a > b { c = 0; } // hint: possible issue with semicolons

        if (a > b) c = 0;

//        if (a > b) c = 0 else b = 0; // hint: possible issue with semicolons
    }

    // Exercise 1.1.5 - bounds test
    public static boolean isBetweenZeroAndOne(double x, double y) {
        return ((x > 0 && x < 1) && (y > 0 && y < 1));
    }

    // Exercise 1.1.6 - print some values
    public static void theTrailingInteger() {
        StdOut.println("theTrailingInteger(): ");

        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    // Exercise 1.1.7 - output values
    public static void ex117a() {
        StdOut.println("ex117a(): ");

        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    public static void ex117b() {
        StdOut.println("ex117b(): ");

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public static void ex117c() {
        StdOut.println("ex117c(): ");

        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }
}
