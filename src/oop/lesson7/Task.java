package oop.lesson7;

public class Task {
    public static void main(String[] args) {
        Book book = new Book( "Harry Potter", "Joane Roaling", 350, false);
        book.getTotalPages();
        book.getTotalString();
        book.getInfo();
    }
}
