import java.util.Arrays;
import java.util.HashMap;

public class StrivesSheet {
    public static void main(String[] args) {
        int[] arr = {3,4,4,2,3,4};

        int[] ad = new int[3];
        ad[0] = 3;
        int f = Integer.MIN_VALUE;

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countElements(int[] array) {
        HashMap<Integer, Integer> frequencyTable = new HashMap<Integer, Integer>();

        for (int element : array) {
                frequencyTable.put(element, frequencyTable.getOrDefault(element, 0)+1);
        }

        System.out.println(frequencyTable);

    }

    static void printNWithRec(int N) {
        if (N == 0) {
            return;
        }
        System.out.println(N);
        printNWithRec(N - 1);
    }

    static void printNTimes(String name, int N) {
        if (N == 0) {
            return;
        }
        System.out.println(name);
        printNTimes(name, N - 1);
    }

    static int countDigits(int number) {

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr, minIndex, i);

        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
