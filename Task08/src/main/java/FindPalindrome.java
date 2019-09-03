import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  Eng:
    Check if the given word is a palindrome

    Rus
    Проверить является ли заданное слово палиндромом
*/

public class FindPalindrome {

        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String strings = reader.readLine();
                System.out.println("This word is palindrome? ");
                System.out.println(palindrome(strings));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private static boolean palindrome (String strings) {
            int n = strings.length();
            for (int i = 0; i < (n/2); i++) {
                if (strings.charAt(i) != strings.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }

    }



