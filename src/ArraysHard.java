import java.util.*;

public class ArraysHard {

    public static void main(String[] args) {

        int[] array = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;

        kMostOccurringElement(array, k);

    }

    private static void kMostOccurringElement(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]){
                    count++;
                }
            }
            map.put(array[i], count);
        }
        System.out.println(map);

        ArrayList<Integer> values = new ArrayList<>(map.values());


    }
}
