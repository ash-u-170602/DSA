import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Arrays1 {
    public static void main(String[] args) {
        int[] array = {1, 4};

        subArray(array, 0);
    }



    public static void subArray(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;

            for (int j = i; j < array.length; j++) {
                currentSum = currentSum + array[j];
                if (currentSum == sum) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }


    public static ArrayList<Integer> leaders(int[] array) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int currentSum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > currentSum) {
                leaders.add(array[i]);
            }
            currentSum = currentSum + array[i];
        }
        return leaders;
    }

    private static void uniqueElement(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                System.out.println(array[i]);
                break;
            }
        }
    }


    public static void printDistinct(int[] array) {
        Arrays.sort(array);

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : array) {
            hashSet.add(i);
        }
        System.out.println(hashSet.toString());
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortWave(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i - 1);
            if (i < arr.length - 1 && arr[i + 1] > arr[i])
                swap(arr, i, i + 1);
        }
    }

    private static int[] waveArray(int[] array) {
        Arrays.sort(array);
        int[] newArr = new int[array.length];
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                newArr[i] = array[end];
                end--;
            } else {
                newArr[i] = array[start];
                start++;
            }
        }
        return newArr;
    }

    private static void rotate(int[] array, int start, int end) {
        int length = array.length;
        while (start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }

    private static void rearrange(int[] array, int shift) {
        rotate(array, 0, shift - 1);
        rotate(array, shift, array.length - 1);
        rotate(array, 0, array.length - 1);
    }

    private static int[] maxMin(int[] array) {
        int[] newArr = new int[array.length];
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                newArr[i] = array[end];
                end--;
            } else {
                newArr[i] = array[start];
                start++;
            }
        }

        return newArr;
    }

    private static int[] segregateEvenAndOdd(int[] array) {
        int[] newArr = new int[array.length];
        int start = 0;
        int end = newArr.length - 1;

        for (int i = 0; i < newArr.length; i++) {
            if (array[i] % 2 == 0) {
                newArr[start] = array[i];
                start++;
            } else {
                newArr[end] = array[i];
                end--;
            }
        }
        return newArr;
    }
}