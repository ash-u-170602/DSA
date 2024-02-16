import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LinkedList {

    public static void main(String[] args) {

        System.out.println(halvesAreAlike("asaf"));

    }

    public static boolean halvesAreAlike(String s) {

        String firstHalf = s.substring(0, s.length() / 2).toLowerCase();
        String secondHalf = s.substring(s.length() / 2).toLowerCase();

        int vowelInFirstHalf = 0;
        int vowelInSecondHalf = 0;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < firstHalf.length(); i++) {
            if (vowels.contains(firstHalf.charAt(i))) {
                vowelInFirstHalf++;
            }

            if (vowels.contains(secondHalf.charAt(i))) {
                vowelInSecondHalf++;
            }
        }

        return vowelInFirstHalf == vowelInSecondHalf;

    }


    public static int countDigits(int num) {
        String numString = String.valueOf(num);

        String[] array = numString.split("");

        int count = 0;

        for (String s : array) {
            int digit = Integer.parseInt(s);
            if (num % digit == 0) count++;
        }

        return count;
    }


    public static int[] separateDigits(int[] nums) {

        int arraySize = 0;

        for (int number : nums) {
            arraySize += String.valueOf(number).length();
        }

        int[] resultArray = new int[arraySize];

        int index = 0;
        for (int number : nums) {
            String numberString = String.valueOf(number);

            for (String string : numberString.split("")) {
                resultArray[index++] = Integer.parseInt(string);
            }
        }

        return resultArray;
    }

    public static int findLucky(int[] arr) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                int value = frequencyMap.get(arr[i]) + 1;
                frequencyMap.put(arr[i], value);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }

        int answer = Integer.MIN_VALUE;

        for (int key : frequencyMap.keySet()) {
            if (key == frequencyMap.get(key)) {
                answer = Math.max(answer, key);
            }
        }

        return answer;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        outerLoop:
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (!allowed.contains(String.valueOf(word.charAt(j))))
                    continue outerLoop;
            }
            res++;
        }


        return res;
    }

}
