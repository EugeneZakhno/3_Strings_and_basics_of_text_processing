import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*     Eng:
       Count the number of lowercase (small) and uppercase (large) letters in the entered string.
       Only use English letters
       Rus:
       Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
       Учитывать только английские буквы
*/
class BigSmallLetters {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(" Small letters "+ findSmall(strings));
            System.out.println(" Big letters "+ findBig(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findSmall(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z'){
                counter++;
            }
        }
        return counter;
    }
    private static int findBig(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z'){
                counter++;
            }
        }
        return counter;
    }
}