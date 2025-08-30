package practice;

import java.util.Arrays;

public class ArrayTasks {
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printOddAndEven(int[] arr) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd: " + odd + "\nEven: " + even);
    }

    public static boolean compareTwoArrays(int[] a, int[] b) {
        return Arrays.equals(a,b);
    }

    public static boolean checkIfArrayContainsElement(int[] a, int element) {
        for (int j : a) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static int countPositive(int[] a) {
        int counter = 0;
        for (int j : a) {
            if (j > 0) {
                counter++;
            }
        }
        return counter;
    }
// 1 2 3 4 5
    //
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < n) { result[k++] = a[i++]; }
        while (j < m) { result[k++] = b[j++]; }

        return result;
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,1,2,3,-13};
        int[] b = {0,1,2,3,4,-13};
//        System.out.println(findMax(arr));
//        printOddAndEven(arr);
//        System.out.println(compareTwoArrays(a, b));
//        System.out.println(checkIfArrayContainsElement(a, 0));
//        System.out.println(countPositive(a));
//        reverseArray(b);

        int[] res = removeDuplicates(a);

        for (int i : res) {
            System.out.println(i + " ");
        }

    }
}
