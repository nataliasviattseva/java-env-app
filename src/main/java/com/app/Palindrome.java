package com.app;

/**
 * A utility class to check if a given string is a palindrome.
 * <p>
 * A palindrome is a word, phrase, number, or other sequence of
 * characters that reads the same forward and backward.
 * </p>
 */
public final class Palindrome { // ← Mark as final to prevent extension

    /**
     * Checks if the given string is a palindrome.
     *
     * @param inputString the string to check (must not be null)
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(final String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }
}
