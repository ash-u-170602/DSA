import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysMedium {
    public static void main(String[] args) {

        long[] array = {-7, -7, -8};
        System.out.println(equilibriumIndex(array));

    }

    private static int equilibriumIndex(long[] array) {

        for (int i = 0; i < array.length; i++) {
            long leftSum = 0;
            long rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum = rightSum + array[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    private static boolean tripletSum(int[] array, int sum) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = i + 2; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == sum) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void findPeak(int[] array) {

        if (array[0] > array[1]) {
            System.out.println(array[0]);
        }

        for (int i = 1; i < array.length - 1; i++) {
            int previous = array[i - 1];
            int current = array[i];
            int next = array[i + 1];

            if (current > previous && current > next) {
                System.out.println(current);
            }

        }

        if (array[array.length - 1] > array[array.length - 2]) {
            System.out.println(array[array.length - 1]);
        }
    }

    private static boolean twoPointerSum(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int majorityElement(int[] a) {
        for (int k : a) {
            int count = 0;
            for (int i : a) {
                if (i == k) {
                    count++;
                }
            }
            if (count > a.length / 2) {
                return k;
            }
        }
        return -1;
    }

    private static void sortTwoArrays(long[] arr1, long[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    long temp = arr2[j];
                    arr2[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    long temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    private static int invCount(int[] array) {

        int invCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) invCount++;
            }
        }
        return invCount;
    }


    private static void maxProfit(int[] array) {
        //To store all the corners of array
        ArrayList<Integer> minimumsAndMaximums = new ArrayList<>();

        if (array[0] < array[1]) {
            minimumsAndMaximums.add(array[0]);
        }

        for (int i = 1; i < array.length - 1; i++) {
            int previous = array[i - 1];
            int current = array[i];
            int next = array[i + 1];
            if (current < previous && current < next) {
                minimumsAndMaximums.add(current);
            } else if (current > previous && current > next) {
                minimumsAndMaximums.add(current);
            }
        }

        if (array[array.length - 1] > array[array.length - 2]) {
            minimumsAndMaximums.add(array[array.length - 1]);
        }

        System.out.println(minimumsAndMaximums);
        // Find max 2 from new list
        if (minimumsAndMaximums.isEmpty()) {
            System.out.println(0);
        } else {
            ArrayList<Integer> sums = new ArrayList<>();

            for (int i = 0; i < minimumsAndMaximums.size() - 1; i += 2) {
                sums.add(minimumsAndMaximums.get(i + 1) - minimumsAndMaximums.get(i));
            }

            System.out.println(sums);
        }


    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void updateArray(int[] array, int l, int r, int x) {
        for (int i = l; i < r + 1; i++) {
            array[i] = array[i] + x;
        }
    }

    private static int smallestMissingNumber(int[] array, int m) {
        int check = 0;
        for (int i = 0; i < m; i++) {
            if (array[i] != check) {
                return check;
            } else {
                check++;
            }
        }
        return m - 1;
    }

    private static int kThSum(int[] array, int k) {

        ArrayList<Integer> sums = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;

            for (int j = i; j < array.length; j++) {
                currentSum = currentSum + array[j];
                sums.add(currentSum);
            }
        }

        Collections.sort(sums);

        return sums.get(sums.size() - k);
    }

    private static void reOrder(int[] array, int[] index) {
        int position = 0;

        for (int i = 0; i < index.length; i++) {
            if (index[i] == position) {
                int temp = array[position];
                array[position] = array[i];
                array[i] = temp;
                position++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //incomplete
    private static void reArrange(int[] array) {
        int pivot = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                pivot++;
                int temp = array[pivot];
                array[pivot] = array[i];
                array[i] = temp;
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void fixArray(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
