import java.util.ArrayList;
import java.util.Arrays;

public class DsaGFGQuestions {

    public static void main(String[] args) {

        char[] bills = {'A', 'A', 'A', 'B', 'B', 'B'};
        int k = 2;
        System.out.println(leastInterval(bills, k));
    }

    private static int leastInterval(char[] tasks, int k) {

        int[] taskCount = new int[26]; // Assuming only uppercase letters
        for (char task : tasks) {
            taskCount[task - 'A']++; // Counting the frequency of each task
        }

        Arrays.sort(taskCount); // Sort the task counts in ascending order

        int maxCount = taskCount[25]; // Get the count of the task with the highest frequency
        int idleTime = (maxCount - 1) * k; // Calculate the idle time based on the cooldown period

        // Distribute the remaining tasks into the idle slots
        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            idleTime -= Math.min(maxCount - 1, taskCount[i]);
        }

        idleTime = Math.max(0, idleTime); // Idle time cannot be negative

        return tasks.length + idleTime; // Total time required is the sum of task length and idle time
    }

    private static boolean lemonadeChange(int[] bills) {

        int count5 = 0;
        int count10 = 0;
        int count20 = 0;

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                count5++;
            } else if (bills[i] == 10) {
                if (count5 > 0) {
                    count5--;
                    count10++;
                } else return false;
            } else {
                if (count5 > 3) {
                    count5 -= 3;
                    count20++;
                } else if (count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                    count20++;
                } else return false;
            }
        }

        return true;
    }

    private static int distributeTicket(int n, int k) {

        ArrayList<Integer> queue = new ArrayList<>();


        return -1;
    }


    private static int noOfMatchSticks(long N) {
        return (N % 5 == 0) ? -1 : (int) (N % 5);
    }

}
