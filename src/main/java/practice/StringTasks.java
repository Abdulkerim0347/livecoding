package practice;

import java.util.Arrays;

public class StringTasks {
    public static String removeVowels(String s) {
        return s.replaceAll("[aiueoAIUEO]", "");
    }
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static int countWords(String s) {
        return s.split(" ").length;
    }

    public static String removeSpaces(String s) {
        return s.replaceAll(" ", "");
    }

    public static int countVowels(String s) {
        if (s == null) { return 0; }
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aiueo".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }

    // abba, ab ba, Ab   b a
    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        return reversed.equals(cleaned);
    }

    public static void main(String[] args) {
        String s = "Hello world!";
//        System.out.println(removeVowels(s));
//        System.out.println(reverseString(s));
//        System.out.println(countWords(s));
//        System.out.println(removeSpaces(s));
//        System.out.println(countVowels(s));
//        System.out.println(isAnagram(s, "world Hello!"));
//        System.out.println(isPalindrome(s));


    }
}
