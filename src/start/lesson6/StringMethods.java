package start.lesson6;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello Word!";
        String word1 = "Hi";
        String word2 = "Java";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.length());
        System.out.println(text.contains("Word"));
        System.out.println(text.contains("word"));
        System.out.println(text.replace("o" , "a"));
        System.out.println(text.repeat(3));
        System.out.println(Arrays.toString(text.split(" ")));
        System.out.println(word1.concat(word2));
        System.out.println(text.startsWith("He"));
        System.out.println(text.endsWith("rd!"));
        System.out.println(text.substring(0,5));
    }
}
