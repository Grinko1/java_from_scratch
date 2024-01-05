package oop.lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("White", 1.4, "Nadya" );
        System.out.println(cat.color);
        cat.showInfo();
        cat.destroySofa("Masha");
        String prey = cat.hunt("Mouse");
        String whatsPrey = cat.hunt("Mouse", false );
        System.out.println(prey);
        System.out.println(whatsPrey);


    }
}
