package start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutoTransmission = true;
        System.out.printf("Hello I am a manager %s \n", carMark);
        System.out.printf("We have the model %s \n", carModel);

        System.out.printf("We have the model - %s for %f \n", carModel, price);
        System.out.println("Does it has an auto transmission?");
        System.out.println(hasAutoTransmission ? "Yes" : "No");

    }
}
