public class DsaGFGQuestions {

    public static void main(String[] args) {

        long n = 32;
        System.out.println(noOfMatchSticks(n));

    }

    private static int noOfMatchSticks(long N) {
        return (N % 5 == 0) ? -1 : (int) (N % 5);
    }

}
