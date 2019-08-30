
public class Task_1 {
    public static void main(String[] args) {
        String [] camelCase = {"camelCase", "fuckYou"};
        String[] snakeCase = converter(camelCase);
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
    private static String[] converter(String[]array){
        //empty array
        String [] snakeCase = new String[array.length];
            for ( int i = 0; i < array.length; i++){
                StringBuilder stringBuilder = new StringBuilder();
                     for ( int j = 0; j < array[i].length(); j++){
                         char letter = array[i].toCharArray()[j];
                         if (Character.isLowerCase(letter)){
                             stringBuilder.append(letter);
                         }else {
                             stringBuilder.append("_");
                             stringBuilder.append(Character.toLowerCase(letter));
                         }
                     }
                     snakeCase[i] = stringBuilder.toString();
            }
        return snakeCase;
    }

}
