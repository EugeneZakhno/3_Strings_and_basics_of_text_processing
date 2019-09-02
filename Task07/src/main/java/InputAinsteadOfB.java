import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Eng:
    In the line, insert after each character 'a' the character 'b'
   Rus:
    В строке вставить после каждого символа 'a' символ 'b'.
*/
public class InputAinsteadOfB {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(replacement(strings));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder replacement(String strings) {

        StringBuilder stringBuilder = new StringBuilder(strings);
        for (int i = 0; i < strings.length(); i++) {
                if (strings.charAt(i) == 'a') {
                    stringBuilder.append("ab");
                } else {
                    stringBuilder.append(strings.charAt(i));
                }
            }
        return stringBuilder;
    }
}
