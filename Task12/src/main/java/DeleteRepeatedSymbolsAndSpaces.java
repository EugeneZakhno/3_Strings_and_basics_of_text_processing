import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    Eng:
    A string is entered. It is required to remove duplicate characters and all spaces from it. For example, if you entered "abc cde
    def ", then" abcdef "should be output.
    
    Rus:
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/
class DeleteRepeatedSymbolsAndSpaces {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(aditing(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String aditing(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for( int i = 0 ; i < stringBuilder.length();i++){
            char character = stringBuilder.charAt(i);
            if(character == ' '){
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if(stringBuilder.charAt(j) == character) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return  stringBuilder.toString();
    }
}