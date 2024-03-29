import java.util.*;

public class StrivesSheet {
    public static void main(String[] args) {

        System.out.println(solveEquation("2x+4=5"));

    }

    public static String solveEquation(String equation) {

        String lhs = equation.split("=")[0];
        String rhs = equation.split("=")[1];

        int numberOfXinLhs = 0;
        int numberOfXinRhs = 0;


        return rhs;
    }



    static int countSatisfiedPersons(int n, int m, ArrayList<Integer> quantity, ArrayList<Integer> need) {

        HashMap<Integer, Integer> fruitMap = new HashMap<>();

        for (int i = 0; i < quantity.size(); i++) {
            fruitMap.put(i, quantity.get(i));
        }

        int currentPerson = 0;

        for (int i = 0; i < need.size(); i++) {

            if (fruitMap.get(need.get(i)) > 0) {
                currentPerson++;
                fruitMap.put(fruitMap.get(i), fruitMap.get(i) - 1);
            }

        }

        return currentPerson;

    }

//    static String findMagicalNumber(int n, int x) {
//        // Write your code here.
//
//        String num= "1";
//        for (int i = 0; i<n-1; i++){
//            num += "0";
//        }
//
//       num += x;
//
//        return num;
//
//    }

//    public List<List<Integer>> generate(int numRows) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//
//        return result;
//
//    }


    public static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    for (int y = 0; y < n; y++) {
                        matrix[j][y] = 0;
                    }
                    for (int y = 0; y < m; y++) {
                        matrix[j][y] = 0;
                    }
                }

            }
        }


    }


    public static int longestConsecutive(int[] nums) {
        int num = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i + 1] + 1 == nums[i]) {
                num++;
            }

        }

        return num + 1;
    }


    public static List<Integer> superiorElements(int[] a) {

        ArrayList<Integer> superiorElements = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] > max) {
                superiorElements.add(a[i]);
            }

            max = Math.max(max, a[i]);

        }

        return superiorElements;
    }

    public static int longestSubArrayWithSumK(int[] a, long k) {
        // Write your code here

        int current = 0;
        int maxTillNow = 0;

        for (int i = 0; i < a.length; i++) {
            if (current > maxTillNow) {
                maxTillNow = current;
            }

            if (current < 0) current = 0;

            current = current + a[i];
        }

        return maxTillNow;
    }

    public static void sortColors(int[] nums) {

        int red = 0;
        int white = 0;
        int blue = 0;

        for (int num : nums) {
            if (num == 0) red++;
            if (num == 1) white++;
            if (num == 2) blue++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (red > 0) {
                nums[i] = 0;
                red--;
                continue;
            }

            if (white > 0) {
                nums[i] = 1;
                white--;
                continue;
            }

            if (blue > 0) {
                nums[i] = 2;
                blue--;
            }
        }

    }

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            try {
                if (arr.get(i) == arr.get(i + 1)) {
                    arr.remove(i);
                }
            } catch (Exception ignored) {
            }
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

            Utils.swap(arr, minIndex, i);

        }

        return arr;
    }


}
