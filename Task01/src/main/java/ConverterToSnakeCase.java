/*
        Eng:
        Given an arrayay of variable names in camelCase. Convert titles to snake_case.
        Rus:
        Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/
class ConverterToSnakeCase {
    public static void main(String[] args) {
        String[] camelCaseArray = {"cameCase", "thatWasAwesome", "itIsTheFinalCountDown", "getPermit"};
        //Объявим еще массив в который запишем результат преобразования первого массива
        String [] snakeCase = convertingToSnakeCase(camelCaseArray);

        //Выведем результат на экран
        System.out.println(String.join(", ", camelCaseArray));
        System.out.println(String.join(", ", snakeCase));
    }

    private static String [] convertingToSnakeCase(String[] array) {
        //Обьъявим массив строк равный пришедшему массиву
        String[] snakeCase = new String[array.length];
        //этот цикл пробегает по массиву элементов (строк)
        for (int i = 0; i < snakeCase.length; i++) {
            //Создаём объект
            StringBuilder strBuilder = new StringBuilder();
            //Этот цикл пробегает по строке (элементу массива)
            for (int j = 0; j < array[i].length(); j++) {
                /* Объявляю переменную и записываю в него слово(array[i])
                   посимвольно методом toCharArray(), который разбивает слово на символы
                   и каждый символ записывается в виде toCharArray()[j], вот так работаем со
                   со строками как с массивами.  */
                char letter = array[i].toCharArray()[j];
                /* Далее если слово, типа char в нижнем регистре (строчной буквой)
                 В Java Character.isLowerCase() возвращает значение true,
                 если переданный символ в нижнем регистре.   */
                if (Character.isLowerCase(letter)){
                    strBuilder.append(letter);//просто выводим СИМВОЛ снова
                } else { // Иначе если в Верхнем регистре то добавляем _
                    //добавляем перед буквой в верхнем регистре
                    strBuilder.append("_");
                    //переводим большую букву в нижний регистр
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            // Теперь преобразуем назад набор символов к строке
            snakeCase[i] = strBuilder.toString();
        }
        // вернем преобразоавнный массив встрок в преобразованном виде
        return snakeCase;
    }
}