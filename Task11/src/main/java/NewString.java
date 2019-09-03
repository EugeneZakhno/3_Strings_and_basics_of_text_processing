

/*  Eng:
    Get a new one from the given string by repeating each character twice

    Rus:
    Из заданной строки получить новую, повторив каждый символ дважды
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewString {

        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String string = reader.readLine();
               // System.out.println(counter(string, 'a'));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




}
