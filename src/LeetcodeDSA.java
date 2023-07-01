public class LeetcodeDSA {
    public static void main(String[] args) {

        String s = "3[a]2[bc]";
        System.out.println(decode(s));

    }

    private static String decode(String s) {

        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                finalString.append(s.charAt(i));
            }else {

            }
        }


        return null;
    }


}
