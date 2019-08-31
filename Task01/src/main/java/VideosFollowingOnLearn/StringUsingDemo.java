package VideosFollowingOnLearn;

import java.util.Arrays;
import java.util.List;

public class StringUsingDemo {

    static String str = "hello";

    public static void main(String[] args) {
        //  СРАВНИВАЕМ СТРОКИ ЧЕРЕЗ ==
       String str0 = new String("hello");
        System.out.println(str == str0); // false
        str0 = str0.intern(); // Заносим переменную str0 в пул строк (пул литералов)
        System.out.println(str == str0); // и теперь уже true

        // ПРОВЕРЯЕМ ПУСТАЯ ЛИ СТРОКА
        String str1 = ""; // пустая строка
        System.out.println(str1.length() == 0); // плохой способ
        System.out.println(str1.isEmpty());  // Хороший способ проверки строк на пустату
        System.out.println(str1.isBlank()); // Проверяте на на пустату и не учитывает пробелы

        String str2 = "     667   78   ";
        System.out.println(str2.strip()); // удалить пробелы в начале и в конце
        System.out.println(str2.replaceAll("\\s+", ""));// удалить все пробелы

        String xss = "<script> alert()</script>";
        xss.replaceAll("</?script>", ""); // отражение xss атаки
        String str3 = " 7876m,m.877bvbv__-878787<><78";
        String[] strArr = str3.split("\\D+"); // выводит только все цифры
        System.out.println(Arrays.toString(strArr));

        String str4 = String.format("java %.2s he%nllo %5.2f","SE000", 55.456484);// форматирум строку
        System.out.println(str4);

        String str5 = String.join("; ", List.of("a", "java", "12", "2019")); // соединим строки и создадим список строк
        System.out.println(str5);

    }
}
