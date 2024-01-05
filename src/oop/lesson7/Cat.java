package oop.lesson7;

public class Cat {
    String color;
    double weight;
    String ownerName;
    public Cat(String color, double weight, String ownerName ){
     this.color = color;
     this.weight = weight;
     this.ownerName = ownerName;
    };
    public void showInfo(){
        System.out.printf("this cat is %s, its weight is %f, its owner is %s \n", this.color, this.weight, this.ownerName);
    }
    public  void destroySofa(String name){
        System.out.printf("Cat destroys the sofa of %s \n" , name);
    }
    public String hunt(String type){
        return type;
    }
    public  String hunt(String type, boolean success){
        if(success){
            return  type;
        }
        return "Failure hunt";
    }
}
