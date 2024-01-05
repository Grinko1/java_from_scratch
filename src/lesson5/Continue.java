package lesson5;

public class Continue {
    public static void main(String[] args) {
        int[] res = {3,4,6,5,3,1};
        for (int num:res){
            if(num == 5){
               continue;
            }else{
                System.out.println("Workout");
            }
        }
    }
}
