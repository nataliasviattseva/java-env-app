package com.app.util;

/**
 * A utility class for mathematical operations.
 * <p>
 * This class is not designed for extension.
 * </p>
 */
public final class Calculator { // ← Add "final" here
    /**
     * Adds two integers.
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(final int a, final int b) { // ← Add "final" to parameters
        return a + b;
    }
}
