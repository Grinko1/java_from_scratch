package oop.lesson7;

public class Book {
    String title;
    String author;
    int pages;
    boolean isDoc;
    public  Book(String title, String author,  int pages, boolean isDoc){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isDoc = isDoc;
    }
    public void getTotalString(){
        System.out.printf("Total strings in book %d \n", this.pages*40);
    }
    public void getTotalPages(){
        System.out.printf("Total pages is %d \n", this.pages);
    }
    public void getInfo(){
        System.out.printf("%s by %s, %s", this.title, this.author, this.isDoc ? "Document" : "not document");
    }

}
