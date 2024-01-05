package lesson6;

public class TextBlock {
    public static void main(String[] args) {
        String name1 = "Nadya";
        String name2 = "Java";
        String text = """
                Hello, whats your name? 
                My name is %s
                And you?
                My name is %s
                """.formatted(name1, name2);
        System.out.println(text);
    }
}
