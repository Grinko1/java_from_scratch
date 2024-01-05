package start.lesson6;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String text = "my name is Nadya Grinko";
        System.out.println(text.substring(11, text.length()));
        String[] arrayStr = text.split(" ");
        System.out.println(Arrays.toString(arrayStr));
        for (String word : arrayStr){
            System.out.println(word);
            System.out.println(word.length());
        }

    }
}
