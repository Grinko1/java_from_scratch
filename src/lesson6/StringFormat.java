package lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Nadya";
        int age = 29;
//        String phrase = "My name is " + name + " I am " + age;
        String phrase = String.format("My name is %s. I'm %d ", name, age);
        System.out.println(phrase);
    }
}
