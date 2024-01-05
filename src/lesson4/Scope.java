package lesson4;

public class Scope {
    public static void main(String[] args) {
        double price = 10_000;
        double newPrice = price;
        if(price > 9_000){
            newPrice *= 0.95;

        }
        System.out.println(price);
        System.out.println(newPrice);
    }
}
