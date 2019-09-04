import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    Eng:
    A string of words is entered, separated by spaces. Find the longest word and print
    him to the screen. The case when there may be several longest words is not processed.
    Rus:
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
    его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/
class FindBiggestWord {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(aditing(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String aditing(String string) {
        String biggestWord = "";
        int maxLenght = 0;
        String[] words = string.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                biggestWord = words[i];
            }
        }
        return biggestWord;
    }
}