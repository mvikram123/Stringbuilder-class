//StringBuilder is a class which provides mutable string which means ,
 //       you can modify content without creating new string object.


public class Main {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello, ");
        stringBuilder.append("world!");
        System.out.println(stringBuilder);

        // Convert StringBuilder to a String
        String result = stringBuilder.toString();

        // Print the result
        System.out.println(result); // Output: Hello, world!

    }
}