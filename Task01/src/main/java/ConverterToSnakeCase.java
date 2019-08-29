/*
        Eng:
        Given an arrayay of variable names in camelCase. Convert titles to snake_case.

        Rus:
        Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/


public class ConverterToSnakeCase {
    public static void main(String[] args) {

        String [] camelCaseArray = {"cameCase","thatWasAwesome", "itIsTheFinalCountDown","getPermit"};
        for(int i = 0; i<camelCaseArray.length;i++){
            System.out.print(camelCaseArray[i]+ ", ");
        }
        convertingToSnakeCase(camelCaseArray);




    }

    private static void convertingToSnakeCase(String[] array){
        String [] snakeCase = new String[array.length];

        for(int i = 0; i<array.length;i++){

        }




    }
}