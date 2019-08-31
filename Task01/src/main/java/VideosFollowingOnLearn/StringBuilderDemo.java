package VideosFollowingOnLearn;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        builder.append("hello");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        builder.insert(2,"internationalization");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        System.out.println(builder.delete(10, 17));
        System.out.println(builder.reverse());

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        builder1.append("java");
        builder2.append(builder1);
        System.out.println(builder1 + " "+ builder2);

        // для объекта StringBuilder не переопределены equals() и hashCode() которые при сравнении
        // всегда вызывает false
        System.out.println(builder1.equals(builder2) + " " + (builder1.hashCode() == builder2.hashCode()));

        // Поэтому правильно сравнивать так через contentEquals()
        System.out.println(builder1.toString().contentEquals(builder2));


    }
}
