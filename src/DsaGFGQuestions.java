import java.util.ArrayList;

public class DsaGFGQuestions {

    public static void main(String[] args) {

        int[] bills = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills));
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
                } else if (count10 > 0 && count5>0) {
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
