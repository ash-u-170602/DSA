import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 3, 2};
        System.out.println(Arrays.toString(rearrangeArray(array)));

    }

    public static int[] rearrangeArray(int[] arr) {
        int[] newArr = new int[arr.length];
        Arrays.sort(arr);

        int max = arr.length;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                newArr[i] = arr[max - 1];
                max--;
            } else {
                newArr[i] = arr[min];
                min++;
            }
        }
        return newArr;
    }


    public static int[] moveAllZeroes(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    int temp;
                    temp = arr[arr.length - 1];
                    arr[arr.length - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int findLargestElement(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static ArrayList<Integer> findTopThree(int[] arr) {
        ArrayList<Integer> threeNumbers = new ArrayList<>();

        int largestNumber = findLargestElement(arr);
        threeNumbers.add(largestNumber);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largestNumber) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondLargest = findLargestElement(arr);
        threeNumbers.add(secondLargest);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largestNumber) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int thirdLargest = findLargestElement(arr);
        threeNumbers.add(thirdLargest);

        return threeNumbers;
    }

}
