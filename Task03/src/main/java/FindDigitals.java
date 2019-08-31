public class FindDigitals {
    public static void main(String[] args) {

        String strings = "1. bona2fide — 1. исти4нн9о\n ";
        findDigits(strings);
    }

    private static void findDigits(String strings) {

        char [] ch = strings.toCharArray();

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 0 || ch[i] < 9) {
                System.out.print(ch[i]+ ", ");
                count++;
            }
        }
        System.out.print(count+ ", ");
    }
}