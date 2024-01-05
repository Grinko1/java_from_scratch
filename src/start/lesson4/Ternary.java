package start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 20;


        var rest = money - breadPrice > 50 ? 20 :5;
        System.out.println("take" + rest);
    }
}
