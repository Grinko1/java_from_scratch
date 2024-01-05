package start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean isBoatBread = false;
        boolean isBoatMilk = true;

        // && and
//        if(isBoatBread && isBoatMilk){
//            System.out.println( "good");
//        }else if(isBoatBread){
//            System.out.println("at least bread");
//        }else if(isBoatMilk){
//            System.out.println("at least milk");
//        }
//        else{
//            System.out.println("bad");
//        }

        // || or
//        if(isBoatBread || isBoatMilk){
//            System.out.println( "good");
//        }
//        else{
//            System.out.println("bad");
//        }

        // != not
        boolean isBoatCandies = true;
        if( !isBoatCandies){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
    }
}
