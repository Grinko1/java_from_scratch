package oop.lesson7;

public class Dog {
    private String name;
    private int weight;
    private String owner;

    public Dog(String name, int weight,String owner){
        if(weight < 1){
            this.weight =1;
        }else{
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }
    public void setWeight(int weight){
        this.weight = Math.max(weight, 1);
    }
    public String getOwner(){
        return this.owner;
    }
    public int getWeight(){
        return this.weight;
    }
}
