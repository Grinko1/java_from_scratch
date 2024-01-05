package lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 198 , 165 };
        int[] group2 = {190, 178 , 175 };
        int[][] allGroup ={  group2, group1};
        upperFor:
        for(int[] item: allGroup){
            for (int person: item){
                if(person == 178){
                    System.out.println("founded");
                    break upperFor;
                }else{
                    System.out.println("not that");
                }
            }

        }
    }
}
