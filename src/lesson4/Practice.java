package lesson4;

public class Practice {
    public static void main(String[] args) {
        var isWorkEngine =true;
        var isWorkTranmission =true;
        var isFineWheel1 =true;
        var isFineWheel2 =true;
        var isFineWheel3 =true;
        var isFineWheel4 =true;

        if(isWorkEngine && isWorkTranmission){
            int count =0;
            if(isFineWheel1){
                count = count + 1;
            }
            if( isFineWheel2){
                count = count + 1;
            }
            if( isFineWheel3){
                count = count + 1;
            }
            if( isFineWheel4){
                count = count + 1;
            }
        if(count > 3){
            System.out.println("ready");
        }else{
            System.out.println("not ready");
        }
        }



    }
}
