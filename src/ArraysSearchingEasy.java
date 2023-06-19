import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArraysSearchingEasy {

    public static void main(String[] args) {

        int[] array1 = {1, 5, 5};
        int[] array2 = {3, 4, 5, 5, 10};
        int[] array3 = {5, 5, 10, 20};

        commonElements(array1, array2, array3);


    }

    private static void commonElements(int[] array1, int[] array2, int[] array3) {

        HashSet<Integer> allElements = new HashSet<>();

        for (int i : array1) {
            allElements.add(i);
        }

        for (int i : array2) {
            if (allElements.contains(i)) {

            }
        }

    }


    private static int kThSmallestElement(int[][] matrix, int k) {

        ArrayList<Integer> allElements = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                allElements.add(matrix[i][j]);
            }
        }

        Collections.sort(allElements);

        System.out.println(allElements);

        return allElements.get(k - 1);
    }

    private static int repeatingElement(int[] array) {

        HashSet<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> repeating = new ArrayList<>();

        for (int i : array) {
            if (uniqueElements.contains(i)) {
                repeating.add(i);
            } else uniqueElements.add(i);
        }

        for (int i : array) {
            if (repeating.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    private static int findMissing(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        int totalSum = ((array.length + 1) * (array.length + 2)) / 2;
        return totalSum - sum;
    }

    private static void printThreeLargest(int[] array) {

        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else if (i > third) {
                third = i;
            }
        }
        System.out.println(first + " " + second + " " + third);

    }
}
