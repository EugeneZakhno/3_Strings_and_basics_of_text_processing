public class Task_001 {

    // Warm up from this site -> http://www.itmathrepetitor.ru/prog/zadachi-na-stroki/
    //1.Дана строка. Вывести ее три раза через запятую и показать количество символов в ней.


    public static void main(String[] args) {
        String str = "In my writings, including several books, in my regular weekly newspaper column in nearly one hundred dailies";
        for ( int i = 0; i < 3; i++)
            System.out.println( str + ", ");

       int count = 0;
        for ( int i = 0; i < str.length(); i++){
            count++;
        }
        System.out.println("The quantity of simbols is " + count);
    }
}
