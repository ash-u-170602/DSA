import java.sql.Array;
import java.util.Arrays;

public class StrivesSheet {
    public static void main(String[] args) {

        int[] array = {4,5,6,3,2,4,7,45,2,35,54,6};
        System.out.println(Arrays.toString(selectionSort(array)));

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
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
