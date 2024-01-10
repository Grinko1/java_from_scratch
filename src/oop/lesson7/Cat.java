package oop.lesson7;

import java.util.Arrays;

public class Cat {
     public String color;
    double weight;
     private String ownerName;
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
    public void feed(String giver, String ...product){
        System.out.printf("%s gave the cat  %s \n", giver, Arrays.toString(product));


    }
}
//80 end
