/*    Eng:
    Change in the string all words "word" to "letter"

    Rus:
    Заменить в строке все вхождения word на letter
*/
public class WordOnLetterChanger {
    public static void main(String[] args) {
        String string = "word word hello world force it word. ";
        System.out.println(string.replace("word", "letter"));
    }
}
