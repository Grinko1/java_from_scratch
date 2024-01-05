package lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while ( count < 100){
            count++;
            System.out.println(count);
        }
        System.out.println("while end");
        while (true){
            count++;
            System.out.println(count);
            if(count >= 150){
                break;
            }
        }
    }
}
