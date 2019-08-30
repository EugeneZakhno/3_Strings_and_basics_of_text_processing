// Warm up from this site -> http://www.itmathrepetitor.ru/prog/zadachi-na-stroki/
//Дана строка. Вывести первый, последний и средний (если он есть)) символы.
public class Task_002 {
    public static void main(String[] args) {
        // String str = "It is no speculative series of extravagant assertions that I make, for these principles have worked";
        String str = "Iyd";
         System.out.println(str.charAt(0));
         System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt((str.length()-1)/2));
    }
}



