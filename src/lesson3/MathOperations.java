package lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x =10;
        int y = 5;

        int sum = x +y;
//        System.out.println(sum);

        int diff = x -y;
//        System.out.println(diff);

        int multiply = x *y;
//        System.out.println(multiply);

        y = 3;
        double devide = (double) x /y;
//        System.out.println(devide);
        x++;
        x +=10;

//        System.out.println(x);
//        System.out.println(y);

        int num =4;
        int modulo = 4 % 2;
        int module1 = 5 % 2;
        int num2 = 3 % 10;
//        System.out.println(modulo);
//        System.out.println(module1);
//        System.out.println(num2);

        int z = 2 + 2 * 2;
        int m = 2 + (2 * 2);
        int n = (2 + 2) * 2;
//        System.out.println(z);
//        System.out.println(m);
//        System.out.println(n);
        float height = 1.74F;
        int weight = 75;
        float res = weight / (height * height);
        System.out.println(res);
    }
}
