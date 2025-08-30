package practice;

import java.util.Arrays;

public class Task {
    public static int sumOfThreeDigits(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Only positive numbers");
            return 0;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    /*
    "abba" - true, "ab ba" - true "Ab ba" - true
     */
    public static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input.toLowerCase());
        String reversed = sb.reverse().toString();

        return reversed.equalsIgnoreCase(input);
    }

    // "veni vidi vici" -> "vici vidi veni"
    // 1) split words into an array
    // 2) print values from end
    public static String reverseWords(String word) {
        String[] words = word.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

    // silent -> listen
    //
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Hello world -> 2
    public static int countNumberOfWords(String input) {
        if (input.trim().isEmpty() || input == null) return 0;

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfWords("Hello        world"));
    }
}
