package oop.lesson7;

public class Recursion {
   public int sum(int num){
       if(num < 1){
           return 0;
       }
       int res = num + sum(num -1);
       return res;
   }
}
