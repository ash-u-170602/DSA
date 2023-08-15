public class POTD {

    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13 21
        System.out.println(nthFibonacci(10));
    }

    static int nthFibonacci(int n){
        int a = 0;
        int b = 1;
        int c = -1;

        if(n==1){
            return 0;
        }

        if(n==2){
            return 1;
        }

        for (int i = 0; i<=n; i++){
            c = a+b;
            int temp = b;
            b = c;
            a = temp;
            System.out.print(c + " ");
        }

        return c;
    }

}
