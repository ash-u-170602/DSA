import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StrivesSheet {
    public static void main(String[] args) {

        int[] arr= {3,5,6,2};

        int[] d = Arrays.stream(arr).sorted().toArray();

    }


    public static int removeDuplicates(ArrayList<Integer> arr, int n) {

        for (int i = 0; i < n-1; i++) {
            try {
                if (arr.get(i) == arr.get(i + 1)) {
                    arr.remove(i);
                }
            }catch (Exception ignored){}
        }

        return arr.size();

    }

    static void countElements(int[] array) {
        HashMap<Integer, Integer> frequencyTable = new HashMap<Integer, Integer>();

        for (int element : array) {
            frequencyTable.put(element, frequencyTable.getOrDefault(element, 0) + 1);
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
